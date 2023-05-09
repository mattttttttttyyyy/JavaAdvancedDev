package org.example.exc1;
//Create a method that takes a list of strings as a parameter, and then returns that list sorted alphabetically from Z to A.

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {


    public List<String> sortString(List<String> toSort) {
        return toSort.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
    public List<String> sortStringIgnoreCase(List<String> toSort) {
        for (int i = 0; i < toSort.size() - 1; i++) {
            for (int j = i + 1; j < toSort.size(); j++) {
                if (toSort.get(i).toLowerCase().compareTo(toSort.get(j).toLowerCase()) < 0) {
                    String temp = toSort.get(i);
                    toSort.set(i, toSort.get(j));
                    toSort.set(j, temp);
                }

            }
    }

        return toSort;
    }}
