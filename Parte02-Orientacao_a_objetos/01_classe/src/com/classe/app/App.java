package com.classe.app;

import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
            // Instancia as classes
            Pessoa pessoa = new Pessoa();
            Scanner sc = new Scanner(System.in);

            // Define os valores dos atributos
            System.out.println("Informe o nome da pessoa: ");
            pessoa.nome = sc.nextLine();
            System.out.println("Informe a idade da pessoa: ");
            pessoa.idade = sc.nextInt();
            System.out.println("Informe a altura da pessoa: ");
            pessoa.altura = sc.nextDouble();
            

            sc.nextLine();

            System.out.println("Informe o E-mail da pessoa: ");
            pessoa.email = sc.nextLine();


            // saída de dados
            pessoa.cumprimentar();
            pessoa.apresentar();


            sc.close();
            

    }
}
