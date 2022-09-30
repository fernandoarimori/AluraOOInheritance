package contasexercicio.domain;

public class ContaPoupanca extends Conta implements ContadorDeImpostos,Transacoes{
public Contador contador;

    public ContaPoupanca(String nome, String cpf) {
        super(nome, cpf);
        this.contador = new Contador();
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
