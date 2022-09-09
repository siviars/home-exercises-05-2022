package io.codelex.typesandvariables.practice;

public class Exercise5_2 {
    public static void main(String[] args) {

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";

        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        //Draw table top
        System.out.print("+");
        for (int top = 1; top <= 54; top++) {
            System.out.print("-");
        }
        System.out.println("+");

        //Draw table
        System.out.println("| 1 | " + course1 + " | " + teacher1 + " | ");
        System.out.println("| 2 | " + course2 + " | " + teacher2 + " | ");
        System.out.println("| 3 | " + course3 + " | " + teacher3 + " | ");
        System.out.println("| 4 | " + course4 + " | " + teacher4 + " | ");
        System.out.println("| 5 | " + course5 + " | " + teacher5 + " | ");
        System.out.println("| 6 | " + course6 + " | " + teacher6 + " | ");
        System.out.println("| 7 | " + course7 + " | " + teacher7 + " | ");
        System.out.println("| 8 | " + course8 + " | " + teacher8 + " | ");

        //Draw table bottom
        System.out.print("+");
        for (int bottom = 1; bottom <= 54; bottom++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
