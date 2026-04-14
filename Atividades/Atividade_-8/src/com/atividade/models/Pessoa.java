package com.atividade.models;

public class Pessoa {

    private String nome;
    private double idade;


    public Pessoa(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return this.idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }



}
