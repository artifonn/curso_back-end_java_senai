package com.veiculos.models;

final public class Caminhao extends Veiculo {

    private int carroceira;

    public Caminhao(String anoFabricacao, String fabricante, String modelo, String placa, String cor,
            String categoria, int carroceira) {
        super(anoFabricacao, fabricante, modelo, placa, cor, categoria);
        this.carroceira = carroceira;
        
    }

    public int getCarroceira() {
        return this.carroceira;
    }

    public void setCarroceira(int carroceira) {
        this.carroceira = carroceira;
    }

    
    

    


    
    

}
