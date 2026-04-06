package com.atividade06.models;

public abstract class Veiculo {
  private String fabricante;
  private String modelo;
  private String cor;
  private String ano;
  private String placa;
  private String categoria;

    // Construtor que recebe os dados comuns + a categoria fixa do filho
    public Veiculo(String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
      this.fabricante = fabricante;
      this.modelo = modelo;
      this.cor = cor;
      this.ano = ano;
      this.placa = placa;
      this.categoria = categoria;
    }

    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public String getAno() { return ano; }
    public String getPlaca() { return placa; }
    public String getCategoria() { return categoria; }
}