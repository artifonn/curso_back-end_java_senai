package com.tipos.app;
public class App {
    public static void main(String[] args) throws Exception {
        String nome = "João";
        int idade = 20;
        double altura = 1.80;

        System.out.println(nome);
        System.out.println(idade);
        System.err.println(altura);

        System.out.println(nome + " possui " +idade+ " anos e " + altura + "m de altura" );
        
    }
}
