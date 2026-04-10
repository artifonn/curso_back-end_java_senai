package com.atividade07.models;

import com.atividade07.repository.Iconta;

public abstract class Conta implements Iconta {
    private String nAgencia;
    private String nConta;
    protected double saldo;

    public Conta(String nAgencia, String nConta, double saldo) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

  @Override
  public void exibirDados() {

    System.out.println("Agencia: " + this.nAgencia);
    System.out.println("Número da Conta: " + nConta);
    System.out.println("Saldo: " + this.saldo);
  }

  @Override
  public double fazerDeposito(double valor) {
    if (valor > 0) {
        this.saldo += valor;
    }
    return valor;
  }

  @Override
  public double fazerSaque(double valor) {
    return this.saldo -= valor;
  }

}
