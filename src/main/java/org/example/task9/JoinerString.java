package org.example.task9;
/*
Add 2 additional classes, JoinerString and JoinerInteger, that inherit from Joiner.
The new classes must implement the same logic as the base class but return the results in the following format:
        - JoinerInteger, assuming joiner is ",": "{0,1,2,3,4,5}"
        - JoinerString, assuming joiner is "-": "[0:text1-1:text2-2:text3]"
*/

import java.util.Arrays;

import static java.lang.System.*;

public class JoinerString extends Joiner<String>{

    public JoinerString(String joiner) {
        super(joiner);
    }

    @Override
    public String join(String... params) {
        StringBuilder generatedString = new StringBuilder();
        int run = 0;
        generatedString.append("[");
        for (String param:
             params) {
            generatedString.append(run).append(super.join(param));
            run++;
        }
        return generatedString.append("]").toString();
    }
}
