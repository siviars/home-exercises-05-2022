package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private static String title;
    private static char take;
    private static int userRating, rating;
    private static String[][] movie = new String[3][3];


    public static void attachVideo(String title, int rating) {
        for (int e = 0; e < 3; e++) {
            if (movie[e][0] == null) {
                movie[e][0] = title;
                movie[e][1] = String.valueOf(rating);
                movie[e][2] = String.valueOf(1);
                break;
            }
        }
    }


    public static void checkedOut(int listNumber) {
        System.out.println(movie[listNumber][2]);
        if (movie[listNumber][2].equals("1")) {
            movie[listNumber][2] = String.valueOf("0");
        } else {
            System.out.println("This movie is not available");
        }
        System.out.println(movie[listNumber][2]);
    }

    public static void returned(int listNumber, double rate) {
        if (movie[listNumber][2].equals("0")) {
            movie[listNumber][2] = String.valueOf("1");
            movie[listNumber][1] = Double.toString((Double.valueOf(movie[listNumber][1]) + rate) / 2);
        } else {
            System.out.println("This movie is already returned");
        }
    }

    public static boolean check() {
        boolean ch = true;
        for (int e = 0; e < 3; e++) {
            if (movie[e][0] == null) {
                ch = false;
            }
        }
        return ch;
    }

    public static void movieList() {
        String av;
        System.out.println("Movie list:");
        System.out.println("------------");
        //Check names
        for (int j = 0; j < movie.length; j++) {
            System.out.println(j + " movie number");
            for (int k = 0; k < movie[j].length; k++) {
                if (movie[j][k] != null) {
                    if (k == 0) {
                        System.out.println("Title: " + movie[j][k]);
                    } else if (k == 1) {
                        System.out.println("Rating: " + movie[j][k]);
                    } else if (k == 2) {
                        if (movie[j][k].equals("1")) {
                            av = "Yes";
                        } else {
                            av = "No";
                        }
                        System.out.println("Availability: " + av);
                        System.out.println("------------");
                    }
                }
            }
        }
    }

}
