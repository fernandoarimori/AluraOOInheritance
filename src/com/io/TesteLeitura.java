package com.io;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream fInput = new FileInputStream("lorem.txt");// em byte
        Reader reader = new InputStreamReader(fInput);// char
        BufferedReader br = new BufferedReader(reader);// leitura
        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

    }
}
