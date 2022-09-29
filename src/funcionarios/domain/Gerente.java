package funcionarios.domain;

public class Gerente extends Funcionario implements Autenticavel {
    private AutenticadorConcordancia autenticador;

    public Gerente() {
        this.autenticador = new AutenticadorConcordancia();
    }
    public int getSenha() {
        return this.autenticador.getSenha();
    }
    @Override
    public float bonificacao() {
        float bonificado = super.getSalario();
        return bonificado;
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    public void setSenha(int senha) {
        this.autenticador.setSenha(getSenha());
    }
}


