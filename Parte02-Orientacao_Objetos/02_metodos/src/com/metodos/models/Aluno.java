package com.metodos.models;

public class Aluno {

   public String nome;

   public String nome() {
    return this.nome;
   }

    public String apresentar() {
        return "Olá, meu nome é " + this.nome();
    }
}
