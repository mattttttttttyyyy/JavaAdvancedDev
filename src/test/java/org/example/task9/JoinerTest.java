package org.example.task9;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.Assert.*;
import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.MessageDigest;
import java.util.stream.Stream;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class JoinerTest {

    @Test
    public void shouldAcceptIntegers(){
        Joiner<Integer> joiner = new Joiner();
        String result = joiner.join("-", 1, 2, 3, 4, 6);
        assertThat(result).isEqualTo("1-2-3-4-6-");
    }



}