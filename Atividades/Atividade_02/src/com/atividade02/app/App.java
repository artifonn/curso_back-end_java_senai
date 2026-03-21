package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO:
        // Crie um programa que receba do usuario o nome e a idade (1x)
        // e depois exiba uma lista de filmes:
        // sala 01 - A Roda Quadrada - livre
        // sala 02 - A Volta dos Que não foram - 12 anos
        // sala 03 - Poeira em alto Mar - 14 anos
        // sala 04 - As tranças do rei careca - 16 anos
        // sala 05 - A vingança do peixe frito - 18 anos
        //  O usuario deverá escolher o filme desejado. Se tiver a idade 
        // mínima para ver o filme, o programa imprime o ingresso e 
        // encerra. Se o Usuário não tiver a idade mínima, o programa
        // bloqueia a entrada e re-exibe a lista de filmes para o usuario
        // escolher outro filme.

        Scanner sc = new Scanner(System.in);

        String nome;
        double idade;
        int opcao;
        boolean permitido;

        // Imprimindo o nome e a idade


        do{
            permitido = true;

        System.out.println("Olá, bem vindo ao cineminha da bagunça " );
        System.out.println("Por favor digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextDouble();

        System.out.println("Por favor, Selecione as opções de filmes abaixo: ");
        System.out.println("Opção 1 - Sala 01 - A Roda Quadrada - livre");
        System.out.println("Opção 2 - Sala 02 - A Volta dos Que não foram - 12 anos ");
        System.out.println("Opção 3 - Sala 03 - Poeira em alto Mar - 14 anos");
        System.out.println("Opção 4 - Sala 04 - As tranças do rei careca - 16 anos ");
        System.out.println("Opção 5 - Sala 05 - A vingança do peixe frito - 18 anos ");
        opcao = sc.nextInt();

        // limpeza de buffer
        sc.nextLine();

        // uso do switch

        switch (opcao) {
            case 1:                              
                System.out.println(nome + ", Muito obrigado pela preferência. Bom filme. ");                              
                break;
            case 2:
                if (idade >= 12){
                System.out.println(nome + ", Muito obrigado pela preferência. Bom filme. ");
                }
                else{
                    permitido = false;
                }
                break;
            case 3:
                 if (idade >= 14){
                    System.out.println(nome + ", Muito obrigado pela preferência. Bom filme.");
                 }
                 else {
                    permitido = false;
                 }
                 break;
            case 4:
                 if (idade >= 16){
                    System.out.println(nome + ", Muito obrigado pela preferência. Bom filme.");
                 }
                 else {
                    permitido = false;
                 }
                 break;
            case 5:
                if (idade >= 18){
                    System.out.println(nome + ", Muito obrigado pela preferência. Bom filme.");
                 }
                 else {
                    permitido = false;
                 }
                 break;

            
            default:
                permitido = false;
                System.out.println("Operacao inválida.");
                break;
        }      
                   
        } while(!permitido);
         
        sc.close();

     

    



    }
}