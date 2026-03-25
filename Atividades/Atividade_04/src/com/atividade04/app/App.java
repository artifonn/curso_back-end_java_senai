package com.atividade04.app;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    Veiculo carro = new Veiculo();
      
    System.out.println("Bem vindo a locCar!");

    System.out.println("**** Informe o veiculo de sua preferência. ****");

    System.out.println("Informe o fabricante: ");
    carro.fabricante = sc.nextLine();

    System.out.println("Informe o modelo do veiculo: ");
    carro.modelo = sc.nextLine();

    System.out.println("Informe a placa do veiculo: ");
    carro.placa = sc.nextLine();

    System.out.println("Informe o ano de fabricação: ");
    carro.ano = sc.nextLine();

    System.out.println("Informe a cor do veiculo: ");
    carro.cor = sc.nextLine();

    System.out.println("O veiculo da sua escolha é: ");

    System.out.println("Fabricante: " + carro.fabricante);
    System.out.println("Modelo: " + carro.modelo) ;
    System.out.println("Placa: " + carro.placa);
    System.out.println("Ano:" + carro.ano);
    System.out.println("Cor: " + carro.cor);

    System.out.println("Parabéns! Você fez uma ótima escolha.");
    System.out.println("Encerrando o seu pedido...");
    
    sc.close();
  }
}
