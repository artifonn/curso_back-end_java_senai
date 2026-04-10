package com.atividade07.models;

public class PessoaJuridica extends Pessoa{
    private String razaoSocial;
    private String nomeFantazia;
    private String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantazia, String cnpj, String email) {
        super(email);
        this.razaoSocial = razaoSocial;
        this.nomeFantazia = nomeFantazia;
        this.cnpj = cnpj;
    }


    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantazia() {
        return this.nomeFantazia;
    }

    public void setNomeFantazia(String nomeFantazia) {
        this.nomeFantazia = nomeFantazia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}
