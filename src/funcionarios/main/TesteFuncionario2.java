package funcionarios.main;

import funcionarios.domain.ContreoleBoinificacao;
import funcionarios.domain.Designer;
import funcionarios.domain.EditorDeVideo;
import funcionarios.domain.Gerente;

public class TesteFuncionario2 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        EditorDeVideo ed1 = new EditorDeVideo();

        ContreoleBoinificacao c1 = new ContreoleBoinificacao();
        c1.registra(g1);

        c1.registra(ed1);

        System.out.println(g1);
        System.out.println(ed1);

    }
}
