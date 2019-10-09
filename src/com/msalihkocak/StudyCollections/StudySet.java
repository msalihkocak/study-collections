package com.msalihkocak.StudyCollections;

import java.util.*;

import static java.util.Collections.sort;

public class StudySet {

    public static void main(String[] args) {
	    // Lists - Not allows duplicate (unique), unordered
        Set<Integer> numbers = new HashSet<>();
                        // new TreeSet<>((o1,o2)->o2-o1);
        numbers.add(42);
        numbers.add(23);
        numbers.add(4);
        numbers.add(23);
        numbers.add(16);
        numbers.add(23);
        numbers.add(8);
        numbers.add(23);
        numbers.add(15);
        System.out.println(numbers);

        // One level simplification
        numbers.forEach(n -> System.out.println(n));

        // Most simplified - Referring to method
        numbers.forEach(System.out::println);
    }
}