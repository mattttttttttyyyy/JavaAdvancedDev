package org.example.task9;
/*
Add 2 additional classes, JoinerString and JoinerInteger, that inherit from Joiner.
The new classes must implement the same logic as the base class but return the results in the following format:
        - JoinerInteger, assuming joiner is ",": "{0,1,2,3,4,5}"
        - JoinerString, assuming joiner is "-": "[0:text1-1:text2-2:text3]"
*/

import java.util.Arrays;

import static java.lang.System.*;

public class JoinerString extends Joiner<Integer>{

    public JoinerString(String joiner) {
        super(joiner);
    }

    @Override
    public String join(Integer... params) {
        StringBuilder generatedString = new StringBuilder();
        int run = 0;
        int stringLeft = params.length;
        for (Integer param:
             params) {
            if (run == 0) generatedString.append("[");
            generatedString.append(run).append(":text:").append(param);
            if(stringLeft > 1){
                generatedString.append(getJoiner());
            } else generatedString.append("]");
            stringLeft--;

            run++;

        }

        return generatedString.toString();
    }
}
