package contasexercicio.domain;

public class ContaCorrente extends Conta{


    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public Double depositar(Double valor) {
        Double x = super.saldo+=valor;
        return x;
    }

    @Override
    public boolean sacar(double valor) {
        Double sacarValor = (super.saldo-valor)+0.2d;
        return super.sacar(sacarValor);
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

