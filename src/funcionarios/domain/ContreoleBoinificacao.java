package funcionarios.domain;

public class ContreoleBoinificacao{
    private float somaS;

    public void registra(Funcionario f){
        float boni= f.bonificacao();
        float x = f.getSalario()+boni;
        f.setSalario(x);
    }

    public double getSomaS() {
        return somaS;
    }
}
