package contasexercicio.domain;


public abstract class Conta extends Cliente implements Transacoes {


   public Integer agencia;
   public Integer conta;
   public Double saldo;

    public Conta(String nome, String cpf) {
        super(nome, cpf);
    }


    @Override
    public String toString() {
        return "Conta{" +
                '\'' +
                "nome='" + super.getNome() +
                ", cpf='" + super.getCpf()  +
                ", agencia=" + this.agencia +
                ", conta=" + this.conta +
                ", saldo=" + this.saldo +
                '}';
    }

    public abstract Double depositar(Double valor);
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



}
