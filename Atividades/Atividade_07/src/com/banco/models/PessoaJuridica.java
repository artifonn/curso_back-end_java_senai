package com.banco.models;

final public class PessoaJuridica extends Pessoa {

    private String razaosocial;
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String email, String razaosocial, String cnpj, String nomeFantasia) {
        super(email);
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
                
    }
 
    public String getRazaosocial() {
        return this.razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    

}
