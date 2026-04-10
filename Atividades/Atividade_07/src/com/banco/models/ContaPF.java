package com.banco.models;

public class ContaPF extends Conta{

    private PessoaFisica pf;


    public ContaPF(String nAgencia, String nConta, double saldo, PessoaFisica pj) {
        super(nAgencia, nConta, saldo);
        this.pf = pj;
        
    }

    public PessoaFisica getPf() {
        return this.pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    // TODO: polimofismo

    public void consultarDados(){
        System.out.println("Nome do Titular: " + this.pf.getNome());
        System.out.println("Cpf do Titular: " + this.pf.getCpf());
        System.out.println("E-mail do titular: " + this.pf.getEmail());
        
    }



}
