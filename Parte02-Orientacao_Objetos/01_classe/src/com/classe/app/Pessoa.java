package com.classe.app;

public class Pessoa {

    // Atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;


    // metodos
    public void cumprimentar () {
        System.out.println("Olá!");
    }

    public void apresentar() {
        System.out.println("Meu nome é " 
            + this.nome + " meu e-mail é " 
            + this.email + " minha altura é " 
            + this.altura);
    }

    
    
}
