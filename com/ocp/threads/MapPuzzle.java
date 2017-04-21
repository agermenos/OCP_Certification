package com.ocp.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by agermenos on 4/20/2017.
 */
public class MapPuzzle<K, V> {
    private final Map<K,V> map=new HashMap<>();
    private final ReadWriteLock rwlock = new ReentrantReadWriteLock();

    public V putIfAbsent(K key, V value){
        rwlock.readLock().lock();
        try{
            V v = map.get(key);
            if (v!= null) return v;
            rwlock.writeLock().lock();
            try {
                map.put(key, value);
                return null;
            }
            finally {
                rwlock.writeLock().unlock();
            }
        }
        finally {
            rwlock.readLock().unlock();
        }
    }

    public static void main(String args[]){
        System.out.println(new MapPuzzle<>().putIfAbsent(42,"hello"));
    }
}
