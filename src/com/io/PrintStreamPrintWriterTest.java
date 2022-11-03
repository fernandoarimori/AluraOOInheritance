package com.io;

import java.io.*;

public class PrintStreamPrintWriterTest {
    public static void main(String[] args) throws IOException {
        long ini = System.currentTimeMillis();
        PrintStream ps= new PrintStream("lorem_copy.txt", "UTF-8");
        ps.println("Testando 123");
        //ps.newLine();
        ps.print(System.lineSeparator());
        ps.println("Testando 123");
        //ps.flush();
        //ps.write('K', );
        ps.println("Testando 123");
        ps.close();

        System.out.println("----------");

        PrintWriter pw= new PrintWriter("lorem_copy.txt", "UTF-8");
        pw.println("qweqweqwewq");
        pw.print("sqweqãé");
        long fim = System.currentTimeMillis();
        pw.print("Passaram: "+ (fim-ini));
        pw.close();




    }
}
