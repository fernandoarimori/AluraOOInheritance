package funcionarios.domain;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public Gerente(String nome, String cfp, float salario) {
        super(nome, cfp, salario);
    }
@Override
    public float bonificacao(){
        float bonificado = super.getSalario();
        return bonificado;
    }

    public Gerente(String nome, String cfp, float salario, int senha) {
        super(nome, cfp, salario);
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

    @Override
    public void setSenha(int senha) {
        this.senha = senha;

    }
}


