package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public MeasurementConverter(double value, ConversionType type) {
        double result;
        if (type == ConversionType.CENTIMETERS_TO_ICHES) {
            result = value * 0.393700787;
            System.out.println("In " + value + " centimeters is " + result + " inches");
        } else if (type == ConversionType.INCHES_TO_CENTIMETERS) {
            result = value * 2.54;
            System.out.println("In " + value + " inches is " + result + " centimeters");
        } else if (type == ConversionType.METERS_TO_YARDS) {
            result = value * 1.0936133;
            System.out.println("In " + value + " meters is " + result + " yards");
        } else if (type == ConversionType.KILOMETERS_TO_MILES) {
            result = value * 0.621371192;
            System.out.println("In " + value + " kilometers is " + result + " miles");
        } else if (type == ConversionType.MILES_TO_KILOMETERS) {
            result = value * 1.609344;
            System.out.println("In " + value + " miles is " + result + " kilometers");
        } else if (type == ConversionType.YARDS_TO_METERS) {
            result = value * 0.9144;
            System.out.println("In " + value + " yards is " + result + " meters");
        } else {
            System.out.println("Your conversation type is incorrect!");
        }

    }
}
