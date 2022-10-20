package com.contasexercicio.main;

import com.contasexercicio.domain.Conta;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> listaConta= new ArrayList();
        ContaCorrente cc1 = new ContaCorrente("Derek", "xxxxx",2222,1);
        ContaCorrente cc2 = new ContaCorrente("Derek", "xxxxx",2222,1);
        ContaPoupanca cp1 = new ContaPoupanca("CP1", "yyyyy",2222,123321);

        listaConta.add(cc1);
        listaConta.add(cp1);
        boolean isThereObj = listaConta.contains(cc2);
        System.out.println(isThereObj);
        Conta ccAbs1 =  listaConta.get(1);
        System.out.println(ccAbs1);
        boolean isTheSame = cc1.equals(cp1);
        System.out.println(isTheSame);

    }
}
