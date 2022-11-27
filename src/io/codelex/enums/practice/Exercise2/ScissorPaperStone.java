package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {

    public static void main(String[] args) {
        int plw = 0;
        int cw = 0;
        Actions symbol = Actions.S;
        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin...\nScissor-Paper-Stone");
        while (true) {
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
            String test = in.nextLine().toLowerCase();
            if (test.equals("q")) {
                break;
            } else if (!test.equals("s")&&!test.equals("p")&&!test.equals("t")) {
                System.out.println("Invalid input, try again...");
            } else {
                String player = Actions.valueOf(test.toUpperCase()).name;
                String computer = symbol.choise(computer()).name;
                System.out.println("My turn: " + computer);
                if (player.equals(computer)) {
                    System.out.println("Tie!");
                } else if (player == "SCISSOR" && computer == "STONE") {
                    System.out.println("Stone breaks scissor, I won!");
                    cw++;
                } else if (player == "STONE" && computer == "PAPER") {
                    System.out.println("Scissor cuts paper, I won!");
                    cw++;
                } else if (player == "PAPER" && computer == "SCISSOR") {
                    System.out.println("Scissor cuts paper, I won!");
                    cw++;
                } else {
                    System.out.println("You won!");
                    plw++;
                }
            }
        }
        int sum= cw+plw;
        System.out.println("Number of trials: "+sum);
        System.out.println("I won "+cw+". You won "+plw);
        System.out.println("Bye");
    }

    public static int computer() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

}
