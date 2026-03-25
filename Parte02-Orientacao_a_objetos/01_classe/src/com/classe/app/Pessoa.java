package com.classe.app;

public class Pessoa {
    // atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;

    // Método
    public void cumprimentar(){
        System.out.println("Olá, boa noite");
    }

    public void apresentar(){
    System.out.print("Meu nome é " + this.nome);
    System.out.print(", meu email é " + this.email);
    System.out.print(", tenho " + this.altura + " metros, ");
    System.out.println(" e tenho " + this.idade + " anos de idade");
    }

}
