package funcionarios.domain;

public class Designer extends Funcionario {

    public Designer(String nome, String cfp, float salario) {
        super(nome, cfp, salario);
    }

    public float bonificacao(){
        float bonificado = super.getSalario() + 150f;
        return bonificado;
    }

}
