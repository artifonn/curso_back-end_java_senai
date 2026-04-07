package com.veiculos.models;

final public class Moto extends Veiculo {

    private String cilindrada;

    public Moto(String anoFabricacao, String fabricante, String modelo, String placa, String cor, String categoria, String cilindrada) {
        super(anoFabricacao, fabricante, modelo, placa, cor, categoria);
        this.cilindrada = cilindrada;
        
    }

    public String getCilidrada() {
        return this.cilindrada;
    }

    public void setCilidrada(String cilidrada) {
        this.cilindrada = cilidrada;
    }



    
    

}
