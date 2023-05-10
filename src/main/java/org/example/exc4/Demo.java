package org.example.exc4;

public class Demo {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(50, ConversionType.CENTIMETERS_TO_INCHES));
    }
}
