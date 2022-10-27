package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw= new BufferedWriter(new FileWriter("lorem_copy.txt"));
        bw.write("Testando 123");
        bw.newLine();
        bw.write("Testando 123");
        bw.flush();
        bw.close();




    }
}
