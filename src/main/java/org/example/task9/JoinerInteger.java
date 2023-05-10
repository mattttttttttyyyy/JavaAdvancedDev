package org.example.task9;

public class JoinerInteger extends Joiner<Integer> {
    public JoinerInteger(String joiner) {
        super(joiner);
    }

    @Override
    public String join(Integer... params) {
        StringBuilder generatedString = new StringBuilder();
        int run = 0;
        int stringLeft = params.length;
        for (Integer param:
                params) {
            if (run == 0) generatedString.append("{");
            generatedString.append(param);
            if(stringLeft > 1){
                generatedString.append(getJoiner());
            } else generatedString.append("}");
            stringLeft--;

            run++;

        }

        return generatedString.toString();
    }
}
