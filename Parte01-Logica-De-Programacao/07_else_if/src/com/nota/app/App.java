package com.nota.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      

        Scanner scanner = new Scanner(System.in);

        String nome;
        double nota;
        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe a sua nota: ");
        nota = scanner.nextDouble();


        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
              System.out.println("Olá, " + nome + " Parabéns! Você foi aprovado.");
            } else if (nota >= 5 ) {
              System.out.println("Olá, " + nome + " você está de recuperação!");
            } else {
              System.out.println("Olá, " + nome + "você foi reprovado");
            }
        } 

        scanner.close();
    }
    
}
