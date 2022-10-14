package io.codelex.Test.Exercise4;

import java.io.*;

public class MyFile {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("myFileRead.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("myFileWrite.txt"));
        StringBuilder line2;
        String line;
        while((line = in.readLine())!=null){
            line2= new StringBuilder(line);
            line2.reverse();
            line = String.valueOf(line2);
            out.write(line);
        }
        in.close();
        out.close();
    }
}


