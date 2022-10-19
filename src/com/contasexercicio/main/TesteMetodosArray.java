package com.contasexercicio.main;

import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;
import com.contasexercicio.domain.GuardadorDeContas;

public class TesteMetodosArray {
    public static void main(String[] args) {
        GuardadorDeContas guarda = new GuardadorDeContas();
        ContaCorrente cc1 = new ContaCorrente("CC","xxx");
        ContaPoupanca cp1 = new ContaPoupanca("CP","zzz");
        guarda.guardar(cc1);
        guarda.guardar(cp1);
        guarda.imprime();
        System.out.println("------");
        guarda.remove(cc1);
        System.out.println("------");
        guarda.imprime();
        System.out.println("----------");
        System.out.println(guarda.getPosition(1));
        System.out.println(guarda.getPosition(0));

    }
}
