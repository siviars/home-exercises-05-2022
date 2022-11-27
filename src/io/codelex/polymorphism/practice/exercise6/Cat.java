package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;

    }

    @Override
    public void eat(Food food) {
        super.foodEaten = food.quantity;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", livingRegion='" + livingRegion + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
