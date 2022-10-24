package com.contasexercicio.domain;

import java.util.Comparator;

public class SortedBySaldo implements Comparator<Conta>{
    @Override
    public int compare(Conta c1, Conta c2) {
        return Double.compare(c1.saldo,c2.saldo);
    }
}
