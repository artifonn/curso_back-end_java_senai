package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis

        String nome;
        String email;
        int idade;
        double altura;

         // Cria objeto que recebe os dados do usuário
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade; ");
        idade = sc.nextInt();
        System.out.println("Informe sua altura em metros ");
        altura = sc.nextDouble();

        // limpeza de buffer
        sc.nextLine();

        System.out.println("Informe o seu e-mail: ");
        email = sc.nextLine();

        // saída de dados
        System.out.println("nome: " + nome);
        System.out.println("nome: " + idade);
        System.out.println("nome: " + altura + " metros");
        System.out.println("nome: " + email);

        // fecha objeto
        sc.close();
        
    }
}
