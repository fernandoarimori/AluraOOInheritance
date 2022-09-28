package funcionarios.main;

import funcionarios.domain.ContreoleBoinificacao;
import funcionarios.domain.Designer;
import funcionarios.domain.EditorDeVideo;
import funcionarios.domain.Gerente;

public class TesteFuncionario2 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("G1","12312312",1000f);
        Designer d1 = new Designer("D2","x12312",500f);
        EditorDeVideo ed1 = new EditorDeVideo("Ed2","x xx12312",500f);

        ContreoleBoinificacao c1 = new ContreoleBoinificacao();
        c1.registra(g1);
        c1.registra(d1);
        c1.registra(ed1);

        System.out.println(g1);
        System.out.println(d1);
        System.out.println(ed1);

    }
}
