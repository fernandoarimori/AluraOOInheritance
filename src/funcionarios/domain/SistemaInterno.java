package funcionarios.domain;

public class SistemaInterno implements Autenticavel {
    private int senha;

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

    public void autentica1(Autenticavel fa) {
        boolean autenticol = fa.autentica(this.senha);
        if (autenticol) {
            System.out.println("Logged in");
        } else {
            System.out.println("Erro de login");
        }
    }
}
