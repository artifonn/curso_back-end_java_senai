package com.models;

final public class PessoaJuridica extends Pessoa {
    public String nomeFantasia;
    public String CNPJ;

    public PessoaJuridica(String nomeFantasia, String CNPJ, String email, String telefone) {
        super(email, telefone);
    }

    public void exibirDados() {
        System.out.println("Nome da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ da empresa: " + this.CNPJ);
        super.exibirDados();
    }
    
}
