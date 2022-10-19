package com.contasexercicio.main;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] =12;
        idades[1] =67;
        idades[2] =42;
        idades[3] =34;
        idades[4] =12;
        int idadeX = idades[2];
        System.out.println(idadeX);
        System.out.println(idades.length);
        System.out.println("-------");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        System.out.println("---------");
        for (int idade: idades) {
            System.out.println("Idade na posicao da array: "+idade);
        }
    }
}
