package org.example.exc1;
//Create a method that takes a list of strings as a parameter, and then returns that list sorted alphabetically from Z to A.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    List<String> toSort;

    public List<String> sortString(List<String> toSort){
       return toSort.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

}
