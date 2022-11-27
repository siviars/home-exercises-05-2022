package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> nameList = new HashSet<>();
        while (true) {
            System.out.println("Enter name: ");
            String test = in.nextLine();
            if (test.equals("")) {
                break;
            }
            nameList.add(test);
        }
        System.out.print("Unique name list contains:");
        for (String element : nameList) {
            System.out.print(" " + element);
        }

    }
}
