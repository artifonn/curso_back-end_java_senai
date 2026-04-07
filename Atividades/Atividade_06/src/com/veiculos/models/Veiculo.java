package com.veiculos.models;

abstract public class Veiculo {

    private String anoFabricacao;
    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;
    private String categoria;

    public Veiculo(String anoFabricacao, String fabricante, String modelo, String placa, String cor, String categoria) {
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.categoria = categoria;
    }

    public String getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    public String getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa ;
    }

     public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return this.cor;
    }


    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // metodos

    public Veiculo(String categoria){
        this.categoria = categoria;
    }    
     
    

    public void exibirDados(){
        System.out.println("Categoria: " + categoria);
        System.out.println("AnoFabricação: " + anoFabricacao);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("placa: " + placa);
        System.out.println("Cor: " + cor);
    }
    



}
