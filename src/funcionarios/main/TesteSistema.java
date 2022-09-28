package funcionarios.main;

import funcionarios.domain.Administrador;
import funcionarios.domain.Autenticavel;
import funcionarios.domain.Gerente;
import funcionarios.domain.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente("Dudu","123123",3_000f);
        ger1.setSenha(2222);
        boolean x =ger1.autentica(1222);
        System.out.println(x);
        Administrador adm = new Administrador("Leleco","12312312",1_200f,123123);
        adm.bonificacao();
        System.out.println(adm.getSalario());
        SistemaInterno sis1 = new SistemaInterno();
        Autenticavel testeAdm = new Administrador("123","123123",1_500f,2222);
        sis1.autentica1(testeAdm);
    }
}
