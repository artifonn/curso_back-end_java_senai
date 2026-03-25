package com.classe.app;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("Olá, para continuar informe os seus dados");

    Pessoa  pessoa = new Pessoa();
    
    // Entrada de dados
    System.out.println("Informe o seu nome; ");
    pessoa.nome = sc.nextLine();

    System.out.println("Informe o seu e-mail: ");
    pessoa.email = sc.nextLine();

    System.out.println("Informe a sua idade: ");
    pessoa.idade = sc.nextInt();

    System.out.println("Informe a sua altura em metros: ");
    pessoa.altura = sc.nextDouble();

    System.out.println("***** Atributos do Objeto***** ");


    // System.out.println("Nome: " + pessoa.nome);
    // System.out.println("E-mail: " + pessoa.email);
    // System.out.println("Idade: " + pessoa.idade);
    // System.out.println("Altura: " + pessoa.altura);
    
    pessoa.cumprimentar();
    pessoa.apresentar();

    sc.close();
  }
}
