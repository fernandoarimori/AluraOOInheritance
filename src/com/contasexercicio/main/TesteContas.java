package com.contasexercicio.main;

import com.contasexercicio.domain.CheckedExClass;
import com.contasexercicio.domain.ContaCorrente;
import com.contasexercicio.domain.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {

        ContaPoupanca cp = new ContaPoupanca("ContaPoupanca", "1231223123");
        ContaCorrente cc = new ContaCorrente("ContaCorrente", "3131313");
        cc.agencia = 1111;
        cc.conta = 1111111;
        cp.agencia = 2222;
        cp.conta = 222222;
        cc.saldo = 0d;
        cp.saldo = 0d;
        cc.depositar(1_000d);
        cp.depositar(500d);
        cc.transferencia(400d, cp);
        System.out.println(cc);
        System.out.println(cp);
        try {
            cc.sacar(3_000d); //sacar tem taxa de 2% para conta corrente
        } catch (CheckedExClass e) {
            e.printStackTrace();
        }
        System.out.println("//////");
        System.out.println(cc);
        System.out.println(cp);
        //Taxa Conta corrente
        cc.gatherTax();
        System.out.println(cc.getContadorSomaImpostos());
        cc.gatherTax();
        System.out.println(cc.getContadorSomaImpostos()); //Somatória pelo metodo de coletar imposto
        cc.gatherTax();
        cc.gatherTax();
        cc.gatherTax();
        cc.gatherTax();
        cc.minusTax();//Abate de texa do saldo
        System.out.println("Conta corrente: "+cc.getContadorSomaImpostos() + " e saldo: " + cc.saldo);
        //Taxas conta poupança
        System.out.println("\nConta pupanca: ");
        cp.gatherTax();
        System.out.println(cp.getContadorSomaImpostos());
        cp.gatherTax();
        cp.gatherTax();
        System.out.println(cp.getContadorSomaImpostos());
        cp.gatherTax();
        cp.minusTax();
        System.out.println("Conta poupanca: "+cp.getContadorSomaImpostos() + " e saldo: " + cp.saldo);


    }
}
