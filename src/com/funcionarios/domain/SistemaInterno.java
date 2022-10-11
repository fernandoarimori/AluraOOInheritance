package com.funcionarios.domain;

public class SistemaInterno implements Autenticavel {
    private AutenticadorConcordancia autenticador;

    public SistemaInterno() {
        this.autenticador = new AutenticadorConcordancia();
    }

    public int getSenha(){
        return autenticador.getSenha();
    }


    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }




    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public void autentica1(Autenticavel fa) {
        boolean autenticol = fa.autentica(this.autenticador.getSenha());
        if (autenticol) {
            System.out.println("Logged in");
        } else {
            System.out.println("Erro de login");
        }
    }
}
