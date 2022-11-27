package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    private static final int NUMBERED_SURVEYED = 12467;
    private static final double PURCHASED_ENERGY_DRINKS = 0.14;
    private static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(NUMBERED_SURVEYED) + " bought at least one energy drink");
        System.out.println(calculatePreferCitris(NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        double energyDrinkers = numberSurveyed * PURCHASED_ENERGY_DRINKS;
        return energyDrinkers;
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        double preferCitrus = numberSurveyed * PREFER_CITRUS_DRINKS;
        return preferCitrus;
    }
}
