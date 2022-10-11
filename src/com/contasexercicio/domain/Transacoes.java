package com.contasexercicio.domain;

public interface Transacoes {
    Double depositar(Double valor);
    void sacar(double valor) throws CheckedExClass; //CHECKED EXCEPTION
    boolean transferencia(double valor, Conta destinatario);

}
