package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa usuario = new Pessoa(
            null, 
            null,
            null,
            null,
            0,
            0
        );


        System.out.println("Informe o nome:");
        usuario.nome = sc.nextLine();
        System.out.println("infrome seu email:");
        usuario.email = sc.nextLine();
        System.out.println("informe seu telefone: ");
        usuario.Telefone = sc.nextLine();
        System.out.println("informe seu cpf: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe sua idade: ");
        usuario.idade = sc.nextInt();
        System.out.println("informe sua altura: ");
        usuario.altura = sc.nextDouble();
        

        System.out.println("Nome: " + usuario.nome);
        System.out.println("E-Mail: " + usuario.email);
        System.out.println("Telefone: " + usuario.Telefone);
        System.out.println("Cpf: " + usuario.cpf);
        System.out.println("Idade: " + usuario.idade);
        System.out.println("Altura: " + usuario.altura);

        

        sc.close();

    }
}
