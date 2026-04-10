package com.banco.models;

final public class ContaPj extends Conta {

    private PessoaJuridica pj;


    public ContaPj(String nAgencia, String nConta, double saldo, PessoaJuridica pj) {
        super(nAgencia, nConta, saldo);
        this.pj = pj;

    }

    public PessoaJuridica getPj() {
        return this.pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }


    public void consultarDados (){
        System.out.println("Nome Fantasia: " + this.pj.getNomeFantasia());
        System.out.println("Razao social: " + this.pj.getRazaosocial());
        System.out.println("CNPJ: " + this.pj.getCnpj());
        System.out.println("Email: " + this.pj.getEmail());
        System.out.println("Email: " + this.pj.getEmail());

    }


    
    

   


}
