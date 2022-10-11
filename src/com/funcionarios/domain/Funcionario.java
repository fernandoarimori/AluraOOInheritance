package com.funcionarios.domain;

public abstract class Funcionario {
    private String nome;
    private String cfp;
    protected float salario;

    public Funcionario() {
    }

    public abstract float bonificacao();

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

    public float setSalario(float salario) {
        this.salario = salario;
        return salario;
    }
}
