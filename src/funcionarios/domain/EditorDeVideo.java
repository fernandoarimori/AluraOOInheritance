package funcionarios.domain;

public class EditorDeVideo extends Funcionario {
    public EditorDeVideo() {

    }

    public float bonificacao() {
        float bonificado = super.getSalario() + 200f;
        return bonificado;
    }

}

