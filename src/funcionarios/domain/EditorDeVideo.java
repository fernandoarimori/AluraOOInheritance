package funcionarios.domain;

public class EditorDeVideo extends Funcionario{
    public EditorDeVideo(String nome, String cfp, float salario) {
        super(nome, cfp, salario);
    }

    public float bonificacao(){
        float bonificado =super.getSalario() +  200f;
        return bonificado;
    }

}
