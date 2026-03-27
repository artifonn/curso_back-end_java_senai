package com.models;

public class Aluno {

    // atributos
    public String nome;
    public String email;
    public double idade;


    // Metodos
    public String darBoasvindas() {
        return "Olá meu nome é " + this.nome + " , meu email é " + this.email + "e tenho " + this.idade + "de idade";
    }
    


}
