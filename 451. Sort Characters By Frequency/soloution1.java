import java.util.*;
import java.util.stream.*;

class Solution {

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public String frequencySort(String s) {

        // build the hash map
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.containsKey(c) == true) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        Map<Character, Integer> ma = sortByValue(m);

        // System.out.println(m.values());
        // System.out.println(m.keySet());
        // System.out.println(ma.keySet());
        // s= String.join(",", ma.keySet());
        s = "";
        for (Character k : ma.keySet())
         {  Integer x = ma.get(k);
            for (Integer i = 0; i < x;i++)
                s = s + k;
         }
        return s;
    }

    

    
}