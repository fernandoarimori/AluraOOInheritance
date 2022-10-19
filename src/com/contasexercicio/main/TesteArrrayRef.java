package com.contasexercicio.main;

import com.contasexercicio.domain.Conta;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

public class TesteArrrayRef {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente("CP1", "yyyyy");
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente("CP2", "xxxxx");
        contas[1] = cc2;
        System.out.println(cc2.getNome());

        ContaCorrente ref = contas[0];
        System.out.println(cc2.getNome());
        System.out.println(ref.getNome());

        System.out.println("---FASE 2 ---");
        Conta[] contaGen = new Conta[5];
        ContaCorrente c3 = new ContaCorrente("CC3","dddddd");
        contaGen[0] = c3;
        ContaCorrente ref2 = (ContaCorrente) contaGen[0];
        System.out.println(c3.getNome());
        System.out.println(ref2.getNome());
    }
}
