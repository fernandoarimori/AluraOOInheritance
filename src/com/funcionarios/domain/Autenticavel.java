package com.funcionarios.domain;

public interface Autenticavel {
    void setSenha(int senha);
    boolean autentica(int senha);
}
