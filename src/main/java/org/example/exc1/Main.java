package org.example.exc1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> pleaseSort = new ArrayList<>();

        pleaseSort.add("a");
        pleaseSort.add("b");
        pleaseSort.add("c");
        pleaseSort.add("d");
        pleaseSort.add("z");

        Sorter sorter = new Sorter();

        System.out.println(sorter.sortString(pleaseSort));


    }
}
