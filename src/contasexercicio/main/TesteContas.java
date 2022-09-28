package contasexercicio.main;

import contasexercicio.domain.ContaCorrente;
import contasexercicio.domain.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {

        ContaPoupanca cp = new ContaPoupanca("C1","123123");
        ContaCorrente cc = new ContaCorrente("C2","123123");
        cc.setSaldo(0d);
        cp.setSaldo(0d);
        cc.depositar(1_000d);
        cp.depositar(500d);
        cc.transferencia(400d, cp);
        System.out.println(cc);
        System.out.println(cp);
        cc.sacar(300d);
        System.out.println(cc);



    }
}
