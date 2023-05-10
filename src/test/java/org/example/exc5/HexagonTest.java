package org.example.exc5;

import static org.junit.Assert.*;
import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

public class HexagonTest {

    Hexagon hexagon = new Hexagon();
    @Test
    public void shouldCalculateArea(){
        int result = hexagon.calculateArea(10);
        assertThat(result).isEqualTo(259);
    }

    @Test
    public void shouldCalculatePerimeter(){
        int result = hexagon.calculatePerimeter(10);
        assertThat(result).isEqualTo(60);
    }

}