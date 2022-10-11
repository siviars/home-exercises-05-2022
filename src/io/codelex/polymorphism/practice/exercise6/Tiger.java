package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);

    }

    @Override
    public void eat(Food food) {
        if (food.toString().equals("Meat")) {
            super.foodEaten = food.quantity;
        } else {
            System.out.println(animalType + "are not eating that type of food!");
            super.foodEaten = null;
        }

    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "livingRegion='" + livingRegion + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
