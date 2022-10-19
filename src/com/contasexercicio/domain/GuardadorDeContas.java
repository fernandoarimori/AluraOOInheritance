package com.contasexercicio.domain;

public class GuardadorDeContas {
    private Object[] contasArq;
    private int posicaoLivre = 0;

    public GuardadorDeContas() {
        this.contasArq = new Object[10];
    }

    public void guardar(Object x){
        contasArq[posicaoLivre] = x;
        posicaoLivre++;
    }

    public void imprime(){
        for (Object objeto: this.contasArq) {
            System.out.println(objeto);
        }
    }

    public void remove(Object x){
        for (Object objeto: this.contasArq) {
            int y=0;
            if (x == this.contasArq[y]){
                this.contasArq[y]=null;
                System.out.println("Conta ["+ x + "] deletada do indice "+ y);
            }
            y++;
        }
    }

    public Object getPosition(int i){
        return this.contasArq[i];
    }


}
