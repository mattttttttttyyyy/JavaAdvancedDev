package org.example.ecx2;

import java.util.*;

/*Create a class called Storage that has a private field of type Map, a public constructor, and the following methods:

        addToStorage(String key, String value): adds elements to the storage.
        printValues(String key): displays all elements under a given key.
        findValues(String value): displays all keys that have the given value.

        The Storage class should allow for storing multiple values under one key.*/
public class Storage {


    private Map<String, List<String>> map = new HashMap<>();



    public void addToStorage(String key, String value) {

        List<String> values = map.get(key);
        if (values == null) {
            values = new ArrayList<>();
        }
        values.add(value);
        map.put(key, values);


    }
    public String printValues(String key){
        return map.get(key).toString();
    }
    public void findValues (String value){
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            if (entry.getValue().contains(value)){
                System.out.println(entry.getKey());
            }
        }
    }


}
