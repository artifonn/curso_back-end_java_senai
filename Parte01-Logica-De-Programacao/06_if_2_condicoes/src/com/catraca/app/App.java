package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double peso;
        double altura;

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe o seu peso:");
        peso = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Informe a sua altura em metros:");
        altura = scanner.nextDouble();

        if (peso <= 120 && altura >= 1.25) { 
            System.out.println("Entrada " + nome + " autorizada.");
            
        } else {
            System.out.println("Entrada " + nome + " não autorizada.");
        }

    
        scanner.close();
    }
}
