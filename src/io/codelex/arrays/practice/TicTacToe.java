package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static String rowColum;
    private static int x = 0;
    private static int y = 0;
    private static char player = 'O';
    private static boolean winner = false;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();
        while (winner == false) {
            System.out.println(player + " choose your location (row, column):");
            rowColum = keyboard.nextLine();
            x = Character.getNumericValue(rowColum.charAt(0));
            y = Character.getNumericValue(rowColum.charAt(2));
            if (board[x][y] == ' ') {
                board[x][y] = player;
                displayBoard();
                checkWinner();
                if (player == 'O') {
                    player = 'X';
                } else {
                    player = 'O';
                }
            } else {
                System.out.println("Incorrect selected location");
            }
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void checkWinner() {
        if ((board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
                (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) ||
                (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
                (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
                (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) ||
                (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) ||
                (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][2] == board[2][0])) {
            System.out.println("Winner is " + player);
            winner = true;
        }
    }
}