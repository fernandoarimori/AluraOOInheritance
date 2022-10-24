package com.contasexercicio.main;

import com.contasexercicio.domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteFunctionObj {
    public static void main(String[] args) {
        ArrayList<Conta> listaConta = new ArrayList();
        ContaCorrente cc1 = new ContaCorrente("Derek", "3xxxx", 2222, 1);
        ContaCorrente cc2 = new ContaCorrente("Der", "2xxxx", 2222, 1);
        ContaPoupanca cp1 = new ContaPoupanca("Are", "4yyyy", 2222, 123321);
        ContaPoupanca cp2 = new ContaPoupanca("Bvd", "56yyyy", 2222, 123321);
        cc1.depositar(332D);
        cc2.depositar(1235D);
        cp1.depositar(22D);
        cp2.depositar(1123D);

        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cp1);
        lista.add(cp2);


        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println("\n====--Ordenando por saldo (Maior para o menor)--=====\n");
        lista.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Double.compare(c1.saldo, c2.saldo);
            }
        });

        Collections.reverse(lista);
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println("\n====--Lexografico --=====\n");
        lista.sort(new Comparator<Conta>() {
            public int compare(Conta c1, Conta c2) {
                String x = c1.getNome();
                String y = c2.getNome();
                return x.compareTo(y);
            }});

        for(
            Conta conta :lista)

            {
                System.out.println(conta);
            }

        System.out.println("\n====--Ordem natural (cpf)--=====\n");
        lista.sort(null);

        for(
            Conta conta :lista)

            {
                System.out.println(conta);
            }


//        listaConta.add(cc1);
//        listaConta.add(cp1);
//        boolean isThereObj = listaConta.contains(cc2);
//        System.out.println(isThereObj);
//        Conta ccAbs1 =  listaConta.get(1);
//        System.out.println(ccAbs1);
//        boolean isTheSame = cc1.equals(cp1);
//        System.out.println(isTheSame);
//        Collections.shuffle(listaConta);
//        for (Conta conta: listaConta
//             ) {
//            System.out.println(conta);
//        }

        }
    }
