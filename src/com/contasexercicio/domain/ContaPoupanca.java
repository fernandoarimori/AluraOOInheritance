package com.contasexercicio.domain;

public class ContaPoupanca extends Conta implements ContadorDeImpostos,Transacoes{
public Contador contador;

    public ContaPoupanca(String nome, String cpf,int agencia, int conta) {
        super(nome, cpf, agencia, conta);
        this.contador = new Contador();
        super.saldo = 0D;
    }

    public ContaPoupanca(String nome, String cpf) {
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
    public Double depositar(Double valor) {
        if (valor > 10_000D){
            throw new UncheckedExClass("Valor muito alto para deposito");
        }
        return super.saldo+=valor;
    }

    @Override
    public void sacar(double valor) throws CheckedExClass {
        super.sacar(valor);
    }

    @Override
    public boolean transferencia(double valor, Conta destinatario) {
        return super.transferencia(valor, destinatario);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void gatherTax() {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos() + super.saldo * 0.02d);
    }

    @Override
    public Double minusTax() {
        return super.saldo-= this.contador.getContadorSomaImpostos();
    }
    public Double getContadorSomaImpostos() {
        return this.contador.getContadorSomaImpostos();
    }

    public void setContadorSomaImpostos(Double contadorSomaImpostos) {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos());
    }
}
