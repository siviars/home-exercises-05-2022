package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        int lines = 0;
        int words = 0;
        int chars = 0;

        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        for (String line : Files.readAllLines(path, charset)) {
            lines++;
            chars = chars + line.length();
            int index = line.indexOf(' ');
            while (index >= 0) {
                if (index + 1 != line.indexOf(' ', index + 1))
                    words++;
                index = line.indexOf(' ', index + 1);
            }
            words++;
        }

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }
}
