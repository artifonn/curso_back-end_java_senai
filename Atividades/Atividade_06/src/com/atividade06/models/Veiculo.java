package com.atividade06.models;

abstract public class Veiculo {
    private String anoFabricacao;
    private String modelo;
    private String cor;
    private String ano;
    private String placa;


    public Veiculo(String anoFabricacao, String modelo, String cor, String ano, String placa) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
