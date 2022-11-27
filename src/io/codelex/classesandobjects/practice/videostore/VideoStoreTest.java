package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            Video.attachVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        if (Video.check()) {
            Video.movieList();
            System.out.println("Select movie number");
            int listNumber = scanner.nextInt();
            Video.checkedOut(listNumber);
        } else {
            System.out.println("Video store is empty!");
        }
    }

    private static void returnVideo(Scanner scanner) {
        if (Video.check()) {
            Video.movieList();
            System.out.println("Select which movie number you return");
            int listNumber = scanner.nextInt();
            System.out.println("What is your rating for this movie?");
            double rate = scanner.nextDouble();
            Video.returned(listNumber, rate);
        } else {
            System.out.println("Video store is empty!");
        }
    }
}
