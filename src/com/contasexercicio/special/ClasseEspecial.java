package com.contasexercicio.special;

import com.contasexercicio.domain.Conta;

public class ClasseEspecial extends Conta {
    public ClasseEspecial(String nome, String cpf) {
        super(nome, cpf);
    }

//    @Override
//    public boolean equals(Conta obj) {
//        return false;
//    }

    @Override
    public Double depositar(Double valor) {
        return null;
    }
}
