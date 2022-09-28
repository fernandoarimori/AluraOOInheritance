package funcionarios.main;

import funcionarios.domain.Funcionario;
import funcionarios.domain.Gerente;

public class TesteFuncionario01 {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Lala", "123123123",2000f);
        System.out.println(f1);
        f1.bonificacao();
        System.out.println("----");
        Gerente g1 = new Gerente("Lolo","123123",5000.00F,123123);
        System.out.println(g1.autentica(123123));
        g1.bonificacao();
        System.out.println(g1);
        System.out.println("---Overrites----");
        System.out.println(f1.bonificacao());
        System.out.println(g1.bonificacao());


    }
}
