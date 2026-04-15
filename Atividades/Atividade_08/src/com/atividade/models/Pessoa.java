package com.atividade.models;

import com.atividade.repository.IUsuario;

public class Pessoa implements IUsuario {

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

    @Override
    public String verificarIdade() {
       return (this.idade >= 18) ? " É maior idade" : " É menor de idade";
    }

   




}
