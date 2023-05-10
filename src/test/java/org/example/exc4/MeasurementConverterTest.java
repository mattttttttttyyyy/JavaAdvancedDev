package org.example.exc4;

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

public class MeasurementConverterTest {
    MeasurementConverter measurementConverter = new MeasurementConverter();
    @Test
    public void checkConversion(){
        double result = measurementConverter.convert(10, ConversionType.CENTIMETERS_TO_INCHES);
        assertEquals(4, result, 0.5);
    }


    @ParameterizedTest
    @MethodSource
    public void shouldAllNumbersWork(ConversionType type, double expected){
        double result = measurementConverter.convert(50, type);
        //assertEquals(expected, result, 0.5);
        assertThat(result).isCloseTo(expected, Percentage.withPercentage(10));

    }
    public static Stream<Arguments> shouldAllNumbersWork(){
        return Stream.of(
                Arguments.of(ConversionType.CENTIMETERS_TO_INCHES, 19.68),
                Arguments.of(ConversionType.INCHES_TO_CENTIMETERS, 127.0),
                Arguments.of(ConversionType.METERS_TO_YARDS, 54.68)
        );
    }



}