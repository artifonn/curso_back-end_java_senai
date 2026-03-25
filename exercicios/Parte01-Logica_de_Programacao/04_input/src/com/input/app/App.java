package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu peso: ");
        int idade = scanner.nextInt();

        System.out.println("Informe a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Limpeza de buffer
        scanner.nextLine();
        System.out.println("Informe o seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("E-mail: " + email);

        scanner.close();
        
        
    }
}
