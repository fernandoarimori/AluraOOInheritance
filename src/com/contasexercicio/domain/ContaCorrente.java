package com.contasexercicio.domain;

public class ContaCorrente extends Conta implements ContadorDeImpostos, Transacoes {
    private Contador contador;

    public ContaCorrente(String nome, String cpf,int agencia, int conta) {
        super(nome, cpf, agencia, conta);
        this.contador = new Contador();
        super.saldo = 0D;
    }

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }



    @Override
    public boolean equals(Object obj) {
        Conta ref = (Conta) obj;
        if(this.agencia!=ref.agencia){
            return false;
        }
        if (this.conta != ref.conta){
            return false;
        }
        return true;
    }

    @Override
    public void gatherTax() {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos() + super.saldo * 0.04d);
    }

    @Override
    public Double minusTax() {
        return super.saldo -= this.contador.getContadorSomaImpostos();
    }

    @Override
    public Double depositar(Double valor) {
        if (valor > 10_000D) {
            throw new UncheckedExClass("Valor invalido para deposito");
        } else {
            return this.saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) throws CheckedExClass { //checked Exception
        if (this.saldo <= valor) {
            throw new CheckedExClass("Valor insuficiente ");
        }
    }

    @Override
    public boolean transferencia(double valor, Conta destinatario) {
        return super.transferencia(valor, destinatario);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public Double getContadorSomaImpostos() {
        return this.contador.getContadorSomaImpostos();
    }

    public void setContadorSomaImpostos(Double contadorSomaImpostos) {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos());
    }



}

