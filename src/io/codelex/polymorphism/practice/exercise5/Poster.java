package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    String dimensions;
    int numberOfCopies;
    int rate;
    int dimensionCosts;

    public Poster(int fee, String dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.rate = costPerCopy;
    }

    @Override
    public int cost() {
        dimensionCosts = (int) (Integer.valueOf(dimensions.substring(0, dimensions.indexOf("x"))) * Integer.valueOf(dimensions.substring(dimensions.indexOf("x") + 1, dimensions.length()))) / 100000;
        return super.cost() + rate * numberOfCopies;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: " + dimensions + ", number of copies =" + numberOfCopies + ", rate=" + rate;
    }
}
