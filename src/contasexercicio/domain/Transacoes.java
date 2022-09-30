package contasexercicio.domain;

public interface Transacoes {
    Double depositar(Double valor);
    boolean sacar(double valor);
    boolean transferencia(double valor, Conta destinatario);

}
