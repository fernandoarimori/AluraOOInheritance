package com.funcionarios.domain;

public class Administrador extends Funcionario implements Autenticavel {
    AutenticadorConcordancia autenticador;

    public Administrador() {
        this.autenticador = new AutenticadorConcordancia();
    }
    @Override
    public float bonificacao() {
        return this.setSalario(getSalario() + 400f);
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
