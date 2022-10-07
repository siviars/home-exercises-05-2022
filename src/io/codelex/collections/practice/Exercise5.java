package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Write number");
        String num = in.nextLine();
        int sum;
        ArrayList<Integer> splitNumber = new ArrayList<>();
        do {
            splitNumber.clear();
            sum = 0;
            for (String nums : num.split("")) {
                splitNumber.add(Integer.valueOf(nums));
            }
            for (int i = 0; i < splitNumber.size(); i++) {
                sum = sum + (int) Math.pow(splitNumber.get(i), 2);
            }
            num = String.valueOf(sum);
        } while (num.length() > 1);
        if (sum == 1) {
            System.out.println("Your number is happy");
        } else {
            System.out.println("Your number not happy");
        }

    }

}
