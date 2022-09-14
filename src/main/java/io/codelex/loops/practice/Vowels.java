package io.codelex.loops.practice;

public class Vowels {

    //TODO: print all vowels using for and foreach
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

                /*
        todo - use for
        for (?) {
            System.out.println(vowels[i]);
        }
        */

        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }
        System.out.println("---");

        /*
        todo - use foreach
        for (?) {
            System.out.println(vowel);
        }
        */

        for (char vowel : vowels) {
            System.out.println(vowel);
        }

    }

}
