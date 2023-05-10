package org.example.exc5;

import static org.junit.Assert.*;
import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void shouldCalculateArea(){
        int result = triangle.calculateArea(15);
        assertThat(112).isEqualTo(result);
    }

}