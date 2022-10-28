package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CriandoProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("login","adm123");
        prop.setProperty("senha","adm123");
        prop.setProperty("endereco","teste.com.br");

        prop.store(new FileWriter("config.properties"),"Arquivo criado");
    }
}
