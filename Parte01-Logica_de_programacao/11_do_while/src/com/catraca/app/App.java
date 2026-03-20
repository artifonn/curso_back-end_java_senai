package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opcao;

    
        // laço de repetição

        do{
            // Mostra as opcoes para o usuario
            System.out.println("Deseja registrar nova entrada ? "); 
            System.out.println("1 - Registrar nova entrada");
            System.out.println("2 - Sair do programa.");
            opcao = sc.nextInt();

            if (opcao == 1){
                // limpeza de buffer

                sc.nextLine();

                System.out.println("Informe seu nome: ");
                nome = sc.nextLine();
                System.out.println("Informe seu peso em kg: ");
                peso = sc.nextDouble();
                System.out.println("Informe sua altura: ");
                altura = sc.nextDouble();
                if (peso <120 && altura >= 1.25){
                    System.out.println("Entrada de " + nome + "autorizada.");
                }
                else {
                    System.out.println("Entrada de" + nome + "não autorizada.");
                }
            }
            else if (opcao == 2){
                System.out.println("Obrigado pela preferência");
            }
            else{
                System.out.println("Opcão inválida");
            }

        } while(opcao != 2);






        sc.close();   


    }
}
