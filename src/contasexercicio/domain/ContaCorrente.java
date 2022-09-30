package contasexercicio.domain;

public class ContaCorrente extends Conta implements ContadorDeImpostos,Transacoes {
    private Contador contador;

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
        this.contador = new Contador();
    }

    @Override
    public void gatherTax() {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos() + super.saldo * 0.04d);
    }

    @Override
    public Double minusTax() {
        return super.saldo-= this.contador.getContadorSomaImpostos();
    }

    @Override
    public Double depositar(Double valor) {
        Double x = super.saldo += valor;
        return x;
    }

    @Override
    public boolean sacar(double valor) {
        Double sacarValor = (super.saldo - valor) + 0.2d;
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

    public Double getContadorSomaImpostos() {
        return this.contador.getContadorSomaImpostos();
    }

    public void setContadorSomaImpostos(Double contadorSomaImpostos) {
        this.contador.setContadorSomaImpostos(this.contador.getContadorSomaImpostos());
    }
}

