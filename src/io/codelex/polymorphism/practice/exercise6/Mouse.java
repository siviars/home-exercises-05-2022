package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void eat(Food food) {
        if (food.toString().equals("Vegetable")) {
            super.foodEaten = food.quantity;
        } else {
            System.out.println(animalType + "are not eating that type of food!");
            super.foodEaten = null;
        }

    }

    @Override
    public void makeSound() {
        System.out.println("Piiii");
    }


    @Override
    public String toString() {
        return "Mouse{" +
                "livingRegion='" + livingRegion + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
