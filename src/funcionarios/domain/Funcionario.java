package domain;

public class Funcionario {
    private String nome;
    private String cfp;
    private float salario;

    public Funcionario(String nome, String cfp, float salario) {
        this.nome = nome;
        this.cfp = cfp;
        this.salario = salario;
    }

    public float bonificacao(){
        float bonificado = this.salario*0.1f;
        return bonificado;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cfp='" + cfp + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}