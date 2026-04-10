package com.atividade07.models;

public class ContaPJ extends Conta {

    private PessoaJuridica pj;

    public ContaPJ(String nAgencia, String nConta, double saldo) {
        super(nAgencia, nConta, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void exibirDados() {
        
    }

    @Override
    public double fazerDeposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double fazerSaque(double valor) {
        return this.saldo -= valor;
    }

}
