package domain;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, String cfp, float salario) {
        super(nome, cfp, salario);
    }
@Override
    public float bonificacao(){
        float bonificado = super.bonificacao()+super.getSalario();
        bonificado = (super.getSalario() + bonificado);
        return bonificado;
    }

    public Gerente(String nome, String cfp, float salario, int senha) {
        super(nome, cfp, salario);
        this.senha = senha;
    }

    public boolean autentica(int senha) {
//        if (senha == this.senha) {
//            return true;
//        }
//        return false;
        boolean x = senha == this.senha;
        return x;
    }

}
