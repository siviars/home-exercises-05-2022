package io.codelex.loops.practice;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String word1, word2;
        int pointCount;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first word:");
        word1 = in.nextLine();
        System.out.println("Enter second word");
        word2 = in.nextLine();
        System.out.print(word1);
        pointCount = 30 - word1.length() - word2.length();
        for (int i = 1; i <= pointCount; i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
}
