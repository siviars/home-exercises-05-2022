package io.codelex.polymorphism.practice.exercise2;

import java.util.Arrays;

public class MakeSounds {
    public static void main(String[] arg) {

        Sound parrot = new Parrot();
        Sound radio = new Radio();
        Sound firework = new Firework();

        Sound[] makeSound = new Sound[]{parrot, radio, firework};
        Arrays.stream(makeSound).iterator().forEachRemaining(Sound::playSound);

    }
}
