package com.msalihkocak.StudyCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class StudyDeque {

    public static void main(String[] args) {
	    // Deque - allows duplicate, ordered, two-sided
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(10); // numbers.add(0,10)
        numbers.addLast(108);
        numbers.add(42);
        numbers.add(23);
        numbers.add(4);
        numbers.add(23);
        numbers.add(16);
        numbers.add(23);
        numbers.add(8);
        numbers.add(23);
        numbers.add(15);
        numbers.offer(10);
        numbers.getFirst();
        numbers.getLast();
        numbers.removeFirst();
        numbers.removeLast();

        numbers.forEach(System.out::println);
    }
}