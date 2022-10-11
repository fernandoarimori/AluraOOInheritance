package com.funcionarios.main;


import com.funcionarios.domain.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        SistemaInterno si= new SistemaInterno();
        si.setSenha(124);
        si.autentica(123);
        si.autentica1(si);
        System.out.println(si.getSenha()+ " "+ si.autentica(123));
    }
}
