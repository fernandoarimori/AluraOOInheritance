package com.contasexercicio.main;

import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

public class TesteToString {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("CC","123123");
        ContaPoupanca cp = new ContaPoupanca("CP","231232");
        cp.depositar(1234D);
        cc.depositar(213D);
        System.out.println(cc.toString());
        System.out.println(cp.toString());


    }
}
