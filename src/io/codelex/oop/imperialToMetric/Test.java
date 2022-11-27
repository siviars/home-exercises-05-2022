package io.codelex.oop.imperialToMetric;

public class Test {
    public static void main(String[] args) {
        MeasurementConverter one = new MeasurementConverter(10, ConversionType.CENTIMETERS_TO_ICHES);
        MeasurementConverter two = new MeasurementConverter(15, ConversionType.YARDS_TO_METERS);
        MeasurementConverter three = new MeasurementConverter(20, ConversionType.MILES_TO_KILOMETERS);
        MeasurementConverter four = new MeasurementConverter(25, ConversionType.METERS_TO_YARDS);
        MeasurementConverter five = new MeasurementConverter(30, ConversionType.KILOMETERS_TO_MILES);
        MeasurementConverter six = new MeasurementConverter(35, ConversionType.INCHES_TO_CENTIMETERS);

    }
}
