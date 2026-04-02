package com.encapsulamento.models;

final public class PessoaJuridica extends Pessoa {
    // Atributos
    private String nommeFantasia;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.nommeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        
    }

    public String getNommeFantasia() {
        return this.nommeFantasia;
    }

    public void setNommeFantasia(String nommeFantasia) {
        this.nommeFantasia = nommeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    

}
