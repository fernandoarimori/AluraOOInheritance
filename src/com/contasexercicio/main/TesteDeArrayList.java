package com.contasexercicio.main;

import com.contasexercicio.domain.Conta;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

import java.util.ArrayList;

public class TesteDeArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ContaCorrente cc1 = new ContaCorrente("CC1","xxxxx");
        ContaCorrente cc2 = new ContaCorrente("CC2","xxxx2");
        ContaCorrente cc3 = new ContaCorrente("CC3","xxxx3");
        ContaPoupanca cp1 = new ContaPoupanca("CP1", "yyyyyy");
        ContaPoupanca cp2 = new ContaPoupanca("CP2", "yyyy2");
        ContaPoupanca cp3 = new ContaPoupanca("CP3", "yyyy3");
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cp2);
        lista.add(cp2);
        lista.remove(cp2);
        lista.add(cp3);
        lista.add(cp3);
        Conta ref = (Conta) lista.get(1);
        System.out.println(ref);
        System.out.println(lista.size());
        System.out.println("==-=-=-=-=-=-=-");
        for (Object elemento:lista) {
            System.out.println(elemento);
        }
    }
}
