package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa usuario = new Pessoa(null, null, null, null, 0, 0);

        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe E-mail: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.CPF = sc.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();
        System.out.println("Informe a altura em metros (1,80): ");
        usuario.altura = sc.nextDouble();

        System.out.println(usuario.nome);
        System.out.println(usuario.email);
        System.out.println(usuario.telefone);
        System.out.println(usuario.CPF);
        System.out.println(usuario.idade);
        System.out.println(usuario.altura);

        sc.close();
    }
}
