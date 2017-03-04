package com.ocp.collections;

import java.util.*;

/**
 * Created by agermenos on 3/4/2017.
 */
public class MapSorter {
    public static <K, V extends Comparable<V>> Map<K,V> sortByValues(final Map<K, V> map){
        Comparator<K> valueComparator = new Comparator<K>(){
            @Override
            public int compare(K o1, K o2) {
                int compare = map.get(o1).compareTo(map.get(o2));
                if (compare==0) return 1;
                else return compare;
            }
        };

        Map<K,V> returnMap = new TreeMap<K,V>(valueComparator);
        returnMap.putAll(map);
        return returnMap;
    }

    public static void main(String args[]){
        String data = DataRetriever.getMuchData();
        String[] rawValues = data.replaceAll ("[,.;]"," ").toLowerCase().split("/s");

        //EntrySet<String, Integer> row = getRow(strValue);
    }
}
