package com.test;

public class TesteString {
    public static void main(String[] args) {
        //String é uma classe umitável, seu atributo recebe imutabilidade, sempre precisa subtituir por um novo
        //objeto.
        String str = "LiteraL"; //syntax literal
        String strReplaced = str.replace("Li", "AA");
        System.out.println(strReplaced);
        System.out.println("-----lower/upper case--------");
        String tiny = str.toLowerCase();
        String big = str.toUpperCase();
        System.out.println(tiny + "-" + big);
        System.out.println("---Substring---");//nao precisa instanciar, retorna uma string
        str.substring(0, 2);//Sempre o segundo parametro e menos um
        str.substring(0, 3);//Imprimir Lit
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(0, 3));
        String str2 = "d wsd DSD  WD wd W  Dw";
        System.out.println(str2.trim());
        for (int i = 0; str.length() >i ; i++) {
            System.out.print(str.charAt(i)+ ", ");
        }
        System.out.println(str2.contains("WwD"));
        String testEmpty = "";
        System.out.println(testEmpty.isEmpty());
        System.out.println(testEmpty.isBlank());
        String[] strArray =  {"Boo, wee, fff, 1111"};
        String[] returnSplit = str.split("Li");
        for (String returnn: returnSplit
             ) {
            System.out.println(returnn);
        }


    }
}
