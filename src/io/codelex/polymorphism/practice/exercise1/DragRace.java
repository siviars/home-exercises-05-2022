package io.codelex.polymorphism.practice.exercise1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {
    private static int winner;
    private static int max;

    public static void main(String[] args) {

        Car audi = new Audi();
        Car bmw = new Bmw();
        Car lexus = new Lexus();
        Car tesla = new Tesla();
        Car mercedes = new Mercedes();
        Car opel = new Opel();
        Optional lexusN = new Lexus();
        Optional mercedesN = new Mercedes();

        Car[] cars = new Car[]{audi, bmw, lexus, tesla, mercedes, opel};
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                lexusN.useNitrousOxideEngine();
                mercedesN.useNitrousOxideEngine();
            }
            Arrays.stream(cars).iterator().forEachRemaining(Car::speedUp);
        }

        String[][] topSpeed =
                {
                        {audi.getClass().getSimpleName(), audi.showCurrentSpeed()},
                        {bmw.getClass().getSimpleName(), bmw.showCurrentSpeed()},
                        {lexus.getClass().getSimpleName(), lexus.showCurrentSpeed()},
                        {tesla.getClass().getSimpleName(), tesla.showCurrentSpeed()},
                        {mercedes.getClass().getSimpleName(), mercedes.showCurrentSpeed()},
                        {opel.getClass().getSimpleName(), opel.showCurrentSpeed()}
                };

        winner = 0;
        max = Integer.valueOf(topSpeed[0][1]);
        for (int j = 1; j < topSpeed.length; j++) {
            if (Integer.valueOf(topSpeed[j][1]) > max) {
                winner = j;
                max = Integer.valueOf(topSpeed[j][1]);
            }
        }
        System.out.println("Winner is " + topSpeed[winner][0] + " with speed " + max);
    }

}


