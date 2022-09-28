package contasexercicio.domain;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
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
    public Integer getAgencia() {
        return super.getAgencia();
    }

    @Override
    public void setAgencia(Integer agencia) {
        super.setAgencia(agencia);
    }

    @Override
    public Integer getConta() {
        return super.getConta();
    }

    @Override
    public void setConta(Integer conta) {
        super.setConta(conta);
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(Double saldo) {
        super.setSaldo(saldo);
    }
}
