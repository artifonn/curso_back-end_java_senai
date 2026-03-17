package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaracao de variáveis
        String nome;
        int idade;
        
        // Instância a classe scanner

        Scanner sc = new Scanner(System.in);
        
        // input
        System.out.println("Informe o seu nome");
        nome = sc.nextLine();
        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        // Verifica a idade
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }
        else {
            System.out.println(nome + " é menor de idade");
        }

        // fecha o objeto
        sc.close();

    }
}
