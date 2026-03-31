package com.heranca.models;

public class PessoaJuridica extends Pessoa{
    public String razaoSocial;
    public String nomeFantasia;
    public String CNPJ;
    public String website;

    public PessoaJuridica() {

    }

    public String recepcionar(String nome) {
        return "Prazer, "  + nome + ". Somos a empresa " + this.nomeFantasia + ".";
    }
    
}
