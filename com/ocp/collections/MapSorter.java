package com.ocp.collections;

import java.util.*;

/**
 * Created by agermenos on 3/4/2017.
 */
public class MapSorter {
    public static <K, V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
        Comparator<K> valueComparator = (o1, o2) -> {
            int compare = map.get(o1).compareTo(map.get(o2));
            if (compare==0) return 1;
            else return compare;
        };

        Map returnMap = new TreeMap (valueComparator);
        returnMap.putAll(map);
        return returnMap;
    }

    public static void main(String args[]){
        String data = DataRetriever.getMuchData();
        String[] rawValues = data.replaceAll ("[,.;]","").toLowerCase().split("\\s");
        Map<String, Integer> entryMap = getWordMap(rawValues);
        //Map<String, Integer> finalMap = sortByValues(entryMap);
        Map<String, Integer>finalMap = new TreeMap<>();
        finalMap.putAll(entryMap);
        for (Map.Entry<String, Integer> entry:finalMap.entrySet()){
            System.out.print (entry.getKey());
            for (int k=0; k<=30; k+=4) {
                if (entry.getKey().length()<k) System.out.print("\t");
            }
            System.out.println("\t---->\t" + Integer.valueOf(entry.getValue()));
        }
    }

    private static Map<String,Integer> getWordMap(String[] rawValues) {
        Map<String, Integer> returnMap = new HashMap<>();
        for (String word:rawValues){
            String trimmedWord = word.trim();
            Integer value = returnMap.get(trimmedWord);
            if (value==null || value==0) value=1;
            else value++;
            returnMap.put(trimmedWord,value);
        }
        return returnMap;
    }
}
