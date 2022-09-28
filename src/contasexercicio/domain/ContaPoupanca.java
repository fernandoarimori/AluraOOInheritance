package contasexercicio.domain;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public Double depositar(Double valor) {
        return super.saldo+=valor;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }

    @Override
    public boolean transferencia(double valor, Conta destinatario) {
        return super.transferencia(valor, destinatario);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
