package com.msalihkocak.StudyCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class StudyList {

    public static void main(String[] args) {
	    //Lists - Allows duplicate, ordered
        List<Integer> numbers = new ArrayList<>();
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
        System.out.println("Seventh element: " + numbers.get(6));
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));

        // Sorting
        sort(numbers);
        System.out.println("Native sorting: " + numbers);
        sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                // DESCENDING
                return t1 - integer;
            }
        });
        System.out.println("Sorting with anonymous class: " + numbers);
        sort(numbers, new IntCompAsc());
        System.out.println("Sorting with defined comparator class: " + numbers);

        Comparator<Integer> descComparator = (o1, o2) -> o2-o1;
        sort(numbers, descComparator);
        System.out.println("Sorting with lambda expression: " + numbers);

        // One level simplification
        numbers.forEach(n -> System.out.println(n));

        // Most simplified - Referring to method
        numbers.forEach(System.out::println);
    }
}

class IntCompAsc implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        // ASCENDING
        return integer - t1;
    }
}