package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração de variaveis

        String nome;
        double peso;
        double altura;

        // Instancia a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("informe seu kg: ");
        peso = sc.nextDouble();
        System.out.println("informe sua altura: ");
        altura = sc.nextDouble();

        // condicional com operador booleano
        if ( peso <= 120 && altura >= 1.25){
            System.out.println("Entrada de " + nome + "autorizada.");

        }
        else { 
            System.out.println("Entrada de " + nome + "Não autorizada ");
        }


        // Fecha o objeto Scanner
        sc.close();
    }
}
