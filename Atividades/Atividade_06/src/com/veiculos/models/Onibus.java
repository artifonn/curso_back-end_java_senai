package com.veiculos.models;

final public class Onibus extends Veiculo{

    private boolean leito;

    public Onibus(String anoFabricacao, String fabricante, String modelo, String placa, String cor, String categoria, boolean leito) {
        super(anoFabricacao, fabricante, modelo, placa, cor, categoria);
        this.leito = leito;
        
    }

    public boolean isLeito() {
        return this.leito;
    }

    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

    
    
}
