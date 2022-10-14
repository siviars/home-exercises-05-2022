package io.codelex.generics.practice.exercise4;

class Zoo {

    void feedAnimal(Cage cage) {
//        feed(cage.getAnimal().lunchBag, cage.getAnimal());
//        feed(cage.animal.getLunchBag(), cage.animal);
//        feed(cage.animal.lunchBag, cage.animal);
    }

    <F extends Food> void feed(F food, Animal<F> animal) {
        animal.eat(food);
    }

    void manage() {
        /*your code here*/
    }
}
