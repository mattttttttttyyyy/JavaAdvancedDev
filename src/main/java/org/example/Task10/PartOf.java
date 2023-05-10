package org.example.Task10;
/*
Implement a generic method called partOf that takes an
array of any type and a function as parameters and returns
the percentage of elements that satisfy the condition.*/

import java.util.Arrays;
import java.util.function.Predicate;


public class PartOf {
    public static void main(String[] args) {
        PartOf partOf = new PartOf();
        System.out.println(partOf.partOf(new Integer[]{1, 2, 3, 4}, num -> num % 2 == 0));
    }

    public <T> int partOf(T[] items, Predicate<T> func){

       long num =  Arrays.stream(items).filter(func).count();
        return (int) ((num * 100) / items.length);
    }

}


