package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e: projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                res.add(e.getKey());


            }
        }
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                int result = s2.length() - s1.length();
                if (result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };

        Collections.sort(res, comparator);

        return res;
    }
}
