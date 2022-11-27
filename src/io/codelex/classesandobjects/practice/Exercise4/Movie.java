package io.codelex.classesandobjects.practice.Exercise4;

import java.util.Arrays;

public class Movie {

    public static String[][] movies = {{"Casino Royale", "Eon Productions", "PG13"},
            {"Samaritan", "Amazon Studios", "M"},
            {"Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG"},
            {"Me Time", "Netflix", "R"},
            {"Glass", "Buena Vista International", "PG13"},
            {"The Gray Man", "Netflix", "M"}};
    public String title;
    public String studio;
    public String rating;

    public static void main(String[] args) {
        Movie mov1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie mov2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie mov3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");
        getPG();
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static void getPG() {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i][2].indexOf("PG") >= 0) {
                System.out.println(Arrays.deepToString(movies[i]));
            }
        }
    }

}
