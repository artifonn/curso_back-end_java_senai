package com.heranca.models;


public class PessoaJuridica extends Pessoa{

    // atributos
    public String razaosocial;
    public String nomeFantasia;
    public String Cnpj;
    public String website;

    // construtor
    public PessoaJuridica(){

    }

    // Método
    public String recepcionar(String nome){
        return "Prazer, " + nome + ". Somos a emprea" + this.nomeFantasia + ".";
    }
    

}
