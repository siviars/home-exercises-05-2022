package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise8 {

    private static String[] words = {"CALIFORNIA", "LABORATORY", "ZOMBIE", "SHARK", "ENERGY"};
    private static String misses = "";
    private static String guess = "";
    private static String word = "";
    private static int wordNumber;
    private static char letter;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        makeWord();
        while (true) {
            board();
            if (word.indexOf("_") < 0) {
                System.out.println("You win!!!");
                break;
            }
            System.out.print("Write letter : ");
            letter = in.nextLine().charAt(0);
            checker();
        }
    }

    private static void makeWord() {
        wordNumber = (int) (Math.random() * words.length);
        for (int i = 0; i < words[wordNumber].length(); i++) {
            word = word + "_";
        }
    }

    private static void board() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=Guess word-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Word: " + word);
        System.out.println("Misses: " + misses);
        System.out.println("Guess: " + guess);
    }

    private static void checker() {
        letter = Character.toUpperCase(letter);
        int index = words[wordNumber].indexOf(letter);
        if (index < 0) {
            if (misses.indexOf(letter) < 0) {
                misses = misses + letter;
            } else {
                System.out.println("This letter was typed.");
            }
        } else {
            if (guess.indexOf(letter) < 0) {
                guess = guess + letter;
                for (int j = index; j < word.length(); j++) {
                    if (words[wordNumber].charAt(j) == letter) {
                        word = word.substring(0, j) + letter + word.substring(j + 1);
                    }
                }
            } else {
                System.out.println("This letter was typed.");
            }
        }
    }
}
