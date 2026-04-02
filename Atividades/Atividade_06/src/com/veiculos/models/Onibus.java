package com.veiculos.models;

final public class Onibus extends Veiculo{

    private String nome;
    private String marca;

    public Onibus(String nome, String marca, String anoFabricacao, String modelo, String placa, String cor) {
        super(anoFabricacao, modelo, placa, cor);
        this.nome = nome;
        this.marca = marca;
        
    }

}
