package com.heranca.models;

public class PessoaFisica extends Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    // Constructor 
    public PessoaFisica() {

    }

    // Method 
    public String apresentar() {
        return "Olá meu nome é " + this.nome + ". Prazer!";
    } 
    
}
