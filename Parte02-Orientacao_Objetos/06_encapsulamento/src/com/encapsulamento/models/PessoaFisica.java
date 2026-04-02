package com.encapsulamento.models;

final public class PessoaFisica extends Pessoa{

    // atributos
    private String nome;
    private String CPF;

    public PessoaFisica(String nome, String CPF, String email, String telefone) {
        super(email, telefone);
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
