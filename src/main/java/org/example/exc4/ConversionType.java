package org.example.exc4;
/*Create an enum class named ConversionType with constants METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES,
INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
        The enum should have a parameter of type Converter which is used to perform calculations for the given type.
        Next, create a class named MeasurementConverter which will have a method
        named convert(int value, ConversionType conversionType). This method will take a value and a conversion type as input,
        and based on the provided value and type of conversion, it will use the
        Converter of the corresponding type to perform the conversion and return the result.*/
public enum ConversionType {
    METERS_TO_YARDS,
    YARDS_TO_METERS,
    CENTIMETERS_TO_INCHES,
    INCHES_TO_CENTIMETERS,
    KILOMETERS_TO_MILES,
    MILES_TO_KILOMETERS;


    public double conversionResult(ConversionType conversionType){
        switch (conversionType){
            case METERS_TO_YARDS -> {
                return  1.0936133;
            }
            case KILOMETERS_TO_MILES -> {
                return  0.621371192;
            }
            case YARDS_TO_METERS -> {
                return 0.9144 ;
            }
            case MILES_TO_KILOMETERS -> {
                return 1.609344;
            }
            case CENTIMETERS_TO_INCHES -> {
                return 0.393700787;
            }
            case INCHES_TO_CENTIMETERS -> {
                return 2.54;
            }
        }
        return 0;
    }

}
