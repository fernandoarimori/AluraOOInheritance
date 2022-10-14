package com.contasexercicio.special;

import com.contasexercicio.domain.Conta;

public class ClasseEspecial extends Conta {
    public ClasseEspecial(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public Double depositar(Double valor) {
        return null;
    }
}
