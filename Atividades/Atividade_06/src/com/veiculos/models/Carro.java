package com.veiculos.models;

final public class Carro extends Veiculo {

    private boolean bagageiro;

    public Carro(String anoFabricacao, String fabricante, String modelo, String placa, String cor, String categoria, boolean bagageiro) {
        super(anoFabricacao, fabricante, modelo, placa, cor, categoria);
        this.bagageiro = bagageiro;
        
    }

    public boolean isBagageiro() {
        return this.bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }


   


    

}
