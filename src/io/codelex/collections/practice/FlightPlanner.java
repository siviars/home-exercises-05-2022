package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "flights.txt";
    private static ArrayList<String> flightFrom = new ArrayList<>();
    private static ArrayList<String> flightTo = new ArrayList<>();
    private static HashSet<String> between = new HashSet<>();
    private static Object[] convert;
    private static int city;
    private static int count;
    private static String map;
    private static String first;
    private static boolean repeat;


    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        readFile();
        String select = "";
        while (!select.equals("#")) {
            map = "";
            repeat = true;
            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");
            select = in.nextLine();
            if (select.equals("1")) {

                for (String shortList : flightFrom) {
                    between.add(shortList);
                }
                System.out.println("Select a city number from which you would like to start");
                printBetween();
                city = in.nextInt();
                checkCities();
                while (repeat) {
                    System.out.println("Select a city number to which you would like to flight");
                    printBetween();
                    city = in.nextInt();
                    checkCities();
                }
                System.out.println("Your trip: " + map);
                System.out.println();
            } else {
                System.out.println("Incorrect choise!");
            }
        }
    }

    public static void readFile() throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        for (String line : Files.readAllLines(path, charset)) {
            if (!line.equals("")) {
                flightFrom.add(line.substring(0, line.indexOf('-') - 1));
                flightTo.add(line.substring(line.indexOf('-') + 3, line.length()));
            }
        }
    }

    public static void printBetween() {
        convert = between.toArray();
        for (int i = 0; i < convert.length; i++) {
            System.out.println(i + ". " + convert[i]);
        }
    }

    public static void checkCities() {
        if (map.equals("")) {
            first = String.valueOf(convert[city]);
            map = map + convert[city];
        } else {
            if (first.equals(String.valueOf(convert[city])))
                repeat = false;
            map = map + "->" + convert[city];
        }
        count = 0;
        between.clear();
        for (String same : flightFrom) {
            if (same.equals(convert[city])) {
                between.add(flightTo.get(count));
            }
            count++;
        }
    }

}
