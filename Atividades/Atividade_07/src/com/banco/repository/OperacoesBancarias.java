package com.banco.repository;

public interface OperacoesBancarias {

    public double sacar(double valor);
    
    public double fazerDeposito(double valor);

    public void consultarDados();

}
