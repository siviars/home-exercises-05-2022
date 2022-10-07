package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "midtermscores.txt";
    private static List<String> count = Arrays.asList(new String[]{"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ", "50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "100: "});

    public static void main(String[] args) throws IOException, URISyntaxException {
        fileContent();
        for (String result : count) {
            System.out.println(result);
        }
    }

    private static void fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset).stream().forEach(a -> {
            if (Integer.valueOf(a) <= 9) {
                count.set(0, count.get(0) + "*");
            } else if (Integer.valueOf(a) >= 10 && Integer.valueOf(a) <= 19) {
                count.set(1, count.get(1) + "*");
            } else if (Integer.valueOf(a) >= 20 && Integer.valueOf(a) <= 29) {
                count.set(2, count.get(2) + "*");
            } else if (Integer.valueOf(a) >= 30 && Integer.valueOf(a) <= 39) {
                count.set(3, count.get(3) + "*");
            } else if (Integer.valueOf(a) >= 40 && Integer.valueOf(a) <= 49) {
                count.set(4, count.get(4) + "*");
            } else if (Integer.valueOf(a) >= 50 && Integer.valueOf(a) <= 59) {
                count.set(5, count.get(5) + "*");
            } else if (Integer.valueOf(a) >= 60 && Integer.valueOf(a) <= 69) {
                count.set(6, count.get(6) + "*");
            } else if (Integer.valueOf(a) >= 70 && Integer.valueOf(a) <= 79) {
                count.set(7, count.get(7) + "*");
            } else if (Integer.valueOf(a) >= 80 && Integer.valueOf(a) <= 89) {
                count.set(8, count.get(8) + "*");
            } else if (Integer.valueOf(a) >= 90 && Integer.valueOf(a) <= 99) {
                count.set(9, count.get(9) + "*");
            } else {
                count.set(10, count.get(10) + "*");
            }
        });
    }
}
