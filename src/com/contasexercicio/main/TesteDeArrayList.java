package com.contasexercicio.main;

import com.contasexercicio.domain.ContaCorrente;

import java.util.ArrayList;

public class TesteDeArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ContaCorrente cc1 = new ContaCorrente("CC1","xxxxx");
        ContaCorrente cc2 = new ContaCorrente("CC2","xxxx2");
        ContaCorrente cc3 = new ContaCorrente("CC3","xxxx3");
        ContaCorrente cp1 = new ContaCorrente("CP1", "yyyyyy");
        ContaCorrente cp2 = new ContaCorrente("CP2", "yyyy2");
        ContaCorrente cp3 = new ContaCorrente("CP3", "yyyy3");
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cp2);
        lista.add(cp2);
        lista.remove(cp2);
        lista.add(cp3);
        lista.add(cp3);
        System.out.println(lista.size());
        System.out.println("==-=-=-=-=-=-=-");
        for (Object elemento:lista) {
            System.out.println(elemento);
        }
    }
}
