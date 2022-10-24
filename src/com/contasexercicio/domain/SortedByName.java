package com.contasexercicio.domain;

import java.util.Comparator;

public class SortedByName implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String x = c1.getNome();
        String y = c2.getNome();
        return x.compareTo(y);
    }
}
