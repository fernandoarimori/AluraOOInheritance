package funcionarios.domain;

public class Administrador extends Funcionario implements Autenticavel {

    public Administrador(String nome, String cfp, float salario, int senha) {
        super(nome, cfp, salario);
        this.senha = senha;
    }

    private int senha;

    @Override
    public float bonificacao() {
        return this.setSalario(getSalario()+400f);
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
