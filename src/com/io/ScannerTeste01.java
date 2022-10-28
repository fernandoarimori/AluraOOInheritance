package com.io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTeste01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("C:\\Users\\SheilaMello\\Desktop\\aluraCursoOO\\byteBankHeranca\\byTeBankHeranca\\src\\contas.csv"));

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner scnr = new Scanner(linha);
            scnr.useLocale(Locale.US);
            scnr.useDelimiter(",");
            String pos1 = scnr.next();
            int pos2 = scnr.nextInt();
            int pos3 = scnr.nextInt();
            String pos4 = scnr.next();
            double pos5 = scnr.nextDouble();

            System.out.format("%s + %04d + %07d + %s + %05.2f%n",pos1,pos2,pos3,pos4,(6+pos5));


        }
        scanner.close();
    }
}
