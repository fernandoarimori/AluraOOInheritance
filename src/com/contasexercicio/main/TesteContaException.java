package com.contasexercicio.main;

import com.contasexercicio.domain.CheckedExClass;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;
import com.contasexercicio.domain.UncheckedExClass;

public class TesteContaException {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("CP","123123");
        ContaCorrente cc = new ContaCorrente("CC", "123123123");
        try{
            cp.depositar(11_000D);
        }catch (UncheckedExClass e){
            e.printStackTrace();
        }
        try{
            cc.depositar(11_000D);
        }catch (UncheckedExClass e){
            e.printStackTrace();
        }

        cp.depositar(500D);
        cc.depositar(550D);
        try {
            cc.sacar(600D);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cc.saldo); //sout de 550
        try {
            cp.sacar(600D);
        } catch (CheckedExClass e) {
            e.printStackTrace();
        }
        System.out.println(cp.saldo); //sout de 500


    }
}
