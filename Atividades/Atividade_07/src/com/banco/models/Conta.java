package com.banco.models;

import com.banco.repository.OperacoesBancarias;

abstract public class Conta implements OperacoesBancarias {

    @Override
    public double sacar(double valor) {
        return valor;
        
    }

    @Override
    public double fazerDeposito(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerDeposito'");
    }

    @Override
    public void consultarDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarDados'");
    }

}
