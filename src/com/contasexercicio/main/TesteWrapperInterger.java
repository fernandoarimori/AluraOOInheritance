package com.contasexercicio.main;

import com.contasexercicio.domain.Conta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteWrapperInterger {
    public static void main(String[] args) {
        Integer idadeRed = Integer.valueOf(29);
        int primitivo = 12;
        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRed);
        lista.add(primitivo);
        int unboxing = lista.get(0);
        System.out.println(unboxing);
        //Parse primitivo->ref
        Integer x = Integer.valueOf("123");
        //Parse voltando ref->primitivo
        int y = Integer.parseInt("123");
        System.out.println(x+" "+y);
        //Constantes
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);


    }
}
