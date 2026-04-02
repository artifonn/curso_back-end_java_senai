package com.veiculos.models;

abstract public class Veiculo {

    private String anoFabricacao;
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(String anoFabricacao, String modelo, String placa, String cor) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }



}
