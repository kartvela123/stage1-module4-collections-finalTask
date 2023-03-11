package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();
        for(Map.Entry<String, Integer> e: sourceMap.entrySet()){
            System.out.println(e.getKey());
            Set<String>set = res.get(e.getKey().length());
            if (set == null) {
                set = new HashSet<>();
                res.put(e.getKey().length(), set);
            }
            set.add(e.getKey());
        }
        return res;
    }
}
