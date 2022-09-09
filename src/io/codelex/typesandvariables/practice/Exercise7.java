package io.codelex.typesandvariables.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write  word");
        String word = in.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        System.out.println("In you word is "+count+" uppercase");

    }
}
