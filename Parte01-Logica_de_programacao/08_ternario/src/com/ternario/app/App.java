package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // declaracao de variaveis
        String nome;
        String result;
        int idade;

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Informe seu nome ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade ");
        idade = sc.nextInt();

        // verifica a idade do usuario
        result = (idade >= 18) ? " é maior idade" : " é menor de idade";

        // Saída de dados
        System.out.println(nome + result);


        // Fecha objeto Scanner
        sc.close();

    }
}
