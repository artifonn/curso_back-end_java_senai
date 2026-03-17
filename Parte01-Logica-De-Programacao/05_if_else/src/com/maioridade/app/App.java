package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);


        System.err.println("Informe o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();

        if (idade > 0 && idade < 18 ) {
            System.out.println(nome + " é menor de idade!");
                        
        } else {
            System.out.println(nome +  " é maior de idade!");
        }
        scanner.close();

    }
}
