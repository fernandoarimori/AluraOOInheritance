package com.contasexercicio.main;

import com.contasexercicio.domain.Cliente;
import com.contasexercicio.domain.Conta;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class TesteDeArrayList {
    public static void main(String[] args) {
        //Adicionando generics
        ArrayList<Conta> lista = new ArrayList();
//        List<Conta> lista = new Vector<Conta>();
//        Collection<Conta> lista = new Vector<Conta>();
        ContaCorrente cc1 = new ContaCorrente("CC1", "xxxxx");
        ContaCorrente cc2 = new ContaCorrente("CC2", "xxxx2");
        ContaCorrente cc3 = new ContaCorrente("CC3", "xxxx3");
        ContaPoupanca cp1 = new ContaPoupanca("CP1", "yyyyyy");
        ContaPoupanca cp2 = new ContaPoupanca("CP2", "yyyy2");
        ContaPoupanca cp3 = new ContaPoupanca("CP3", "yyyy3");
//        Cliente cliente = new Cliente("AASD","123123");
//        lista.add((Conta) cliente);
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cp2);
        lista.add(cp2);
        lista.remove(cp2);
        lista.add(cp3);
        lista.add(cp3);
        lista.add(cc3);
        lista.add(cc2);
        Conta ref = (Conta) lista.get(1);
        System.out.println(ref);
        System.out.println(lista.size());
        System.out.println("==-=-=-=-=-=-=-");
        for (Conta elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("---------");
        System.out.println(lista.get(3));
    }
}
