package com.funcionarios.domain;

public class Designer extends Funcionario {

    public Designer() {

    }

    public float bonificacao(){
        float bonificado = super.getSalario() + 150f;
        return bonificado;
    }

}
