package contasexercicio.domain;


public class Conta extends Cliente {


    private Integer agencia;
    private Integer conta;
    private Double saldo;

    public Conta(String nome, String cpf) {
        super(nome, cpf);
    }


    @Override
    public String toString() {
        return "Conta{" +
                '\'' +
                ", agencia=" + this.agencia +
                ", conta=" + this.conta +
                ", saldo=" + this.saldo +
                '}';
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;

    }

    public boolean sacar(double valor) {
        boolean x = this.saldo >= valor;
        this.saldo -= valor;
        return x;
    }

    public boolean transferencia(double valor, Conta destinatario) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destinatario.depositar(valor);
            return true;
        }
        return false;
    }


    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
