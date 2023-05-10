package org.example.task9;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

public class JoinerTest {

    @Test
    public void shouldAcceptIntegers(){
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4, 6);
        assertThat(result).isEqualTo("1-2-3-4-6");
    }

    @Test
    public void shouldJoinerStringWork()
    {
        JoinerString joinerString = new JoinerString("-");
        String result = joinerString.join(1, 2, 3, 4, 5);
        assertThat(result).isEqualTo("[0:text:1-1:text:2-2:text:3-3:text:4-4:text:5]");
    }

    @Test
    public void shouldJoinerIntegerWork(){
        JoinerInteger joinerInteger = new JoinerInteger(",");
        String result = joinerInteger.join(1, 2, 3, 4, 5);
        assertThat(result).isEqualTo("{1,2,3,4,5}");

    }

    @ParameterizedTest
    @MethodSource
    public void shouldJoinerIntegerWorkTest(String expected, String joiner){

        JoinerInteger joinerInteger = new JoinerInteger(joiner);
        String result = joinerInteger.join(1, 2, 3, 4, 5);
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> shouldJoinerIntegerWorkTest(){
        return Stream.of(Arguments.of("{1,2,3,4,5}", ","),
        Arguments.of("{1=2=3=4=5}", "=")
        );
    }


}