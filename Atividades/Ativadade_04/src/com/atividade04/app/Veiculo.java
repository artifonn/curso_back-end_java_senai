package com.atividade04.app;


public class Veiculo {
    public String nome;
    public String fabricante;
    public String modelo;
    public String placa;
    public String cor;
    public String ano;


    public void Saudar(){
        System.out.println(" olá boa noite");

    }
    public void especificar() {
        System.out.println(" As espeficações do seu carro é");
        System.out.println("O nome do seu carro é " + this.nome);
        System.out.println("A marca do seu fabricante é " + this.fabricante);
        System.out.println(", sendo se modelo " + this.modelo);
        System.out.println("com a placa " + this.placa);
        System.out.println(", com a cor  " + this.cor);
        System.out.println("e do ano " + this.ano);
    }





}
