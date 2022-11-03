package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw= new BufferedWriter(new FileWriter("lorem_copy.txt", StandardCharsets.ISO_8859_1));
        bw.write("Testando 123");
        bw.newLine();
        bw.write("Testando 123ãç");
        bw.flush();
        bw.close();




    }
}
