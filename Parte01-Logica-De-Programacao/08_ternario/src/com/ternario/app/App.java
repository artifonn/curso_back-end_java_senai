package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String result;
        int idade;

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe a sua idade?: ");
        idade = scanner.nextInt();

        result = (idade >= 18) ? " você é maior de idade!" : " você é menor de idade!";

        System.out.println("Olá, " + nome + result);

        scanner.close();
    }
}
