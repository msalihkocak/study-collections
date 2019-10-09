package com.msalihkocak.StudyCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudyMap {

    public static void main(String[] args) {
        Map<String, Integer> areaCodes = new HashMap<>();
                // new TreeMap<>(); Ordered with alphabetical or numerical order
                // new LinkedHashMap<>(); Ordered with adding order
                // new WeakHashMap<>(); Soft referenced hash map, used for caching purposes
        areaCodes.put("İstanbul-Anadolu", 216);
        areaCodes.put("İstanbul-Asya", 212);
        areaCodes.put("Ankara", 312);
        System.out.println(areaCodes.get("Ankara"));
        for (String city : areaCodes.keySet())
            System.out.println("city: " + city);
        for (Integer code : areaCodes.values())
            System.out.println("code: " + code);
        for (Map.Entry<String, Integer> entry : areaCodes.entrySet())
            System.out.println("Entry -> " + entry.getKey() + ": " + entry.getValue());
    }
}
