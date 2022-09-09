package io.codelex.typesandvariables.practice;

public class Exercise5 {
    public static void main(String[] args) {
        String[][] school = {
                {"English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology I", "Latin II", "AP US History", "Business Computer Infomation Systems"},
                {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer", "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"}
        };

        //Count arrays length
        int rowCount1 = 0;
        int rowCount2 = 0;
        for (int row = 0; row < school.length; row++) {
            int arraySymbols = 0;
            for (int column = 0; column < school[row].length; column++) {
                if (school[row][column].length() > arraySymbols) {
                    arraySymbols = school[row][column].length();
                }
            }
            if (row > 0) {
                rowCount2 = rowCount2 + arraySymbols;
            } else {
                rowCount1 = rowCount1 + arraySymbols;
            }

        }

        //Draw table top
        System.out.print("+");
        for (int top = 1; top <= (rowCount1 + rowCount2 + 9); top++) {
            System.out.print("-");
        }
        System.out.println("+");

        //Draw table
        for (int tableRows = 1; tableRows <= school[0].length; tableRows++) {
            System.out.print("| " + tableRows + " | ");
            for (int space = 1; space < (rowCount1 - school[0][tableRows - 1].length() + 1); space++) {
                System.out.print(" ");
            }
            System.out.print(school[0][tableRows - 1] + " | ");
            for (int space = 1; space < (rowCount2 - school[1][tableRows - 1].length() + 1); space++) {
                System.out.print(" ");
            }
            System.out.println(school[1][tableRows - 1] + " | ");
        }

        //Draw table bottom
        System.out.print("+");
        for (int bottom = 1; bottom <= (rowCount1 + rowCount2 + 9); bottom++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
