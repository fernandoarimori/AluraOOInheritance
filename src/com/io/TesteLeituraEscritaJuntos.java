package com.io;

import java.io.*;

public class TesteLeituraEscritaJuntos {
    public static void main(String[] args) throws IOException {
        InputStream fInput = System.in; //new FileInputStream("lorem.txt");// em byte
        Reader reader = new InputStreamReader(fInput);// char
        BufferedReader br = new BufferedReader(reader);// leitura
        String linha = br.readLine();

//        System.out.println("------------");

        OutputStream fOut = System.out; //new FileOutputStream("lorem_copy.txt");
        Writer writer = new OutputStreamWriter(fOut);
        BufferedWriter bw = new BufferedWriter(writer); //Segundo paramentro 0=substitui, 1=concatena
//        bw.write(linha);
//        bw.newLine();
        while (linha != null && !linha.isEmpty() ) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }
        bw.close();
        br.close();
    }
}
