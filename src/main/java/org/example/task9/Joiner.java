package org.example.task9;
/*Design a Joiner class that takes a separator (string) in the constructor
and has a join() method that allows any number of objects of type T to be passed as arguments.
This method will return a string by joining all the passed elements by calling
their toString() method and separating them with the separator.
        For example, for Integers and a separator of "-", it should return: "1-2-3-4...".*/
public class Joiner<T> {
    private T elements;
    private String joiner;

    public Joiner(String joiner) {
        this.joiner = joiner;
    }

    public String getJoiner() {
        return joiner;
    }

    public String join(T ... params){
        StringBuilder generatedString = new StringBuilder();
        int stringLeft = params.length;

        for (T param : params) {
            generatedString.append(param.toString());
            if(stringLeft > 1){
                generatedString.append(joiner);
            }
            stringLeft--;
        }

        return generatedString.toString();
    }



}
