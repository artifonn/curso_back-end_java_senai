package com.atividade04.app;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

  Scanner sc = new Scanner(System.in);
  Carro carro = new Carro();
    
  System.out.println("Bem vindo a locCar!");

  System.out.println("**** Informe o carro de sua preferência. ****");

  System.out.println("Informe o fabricante: ");
  carro.fabricante = sc.nextLine();

  System.out.println("Informe o modelo do carro: ");
  carro.modelo = sc.nextLine();

  System.out.println("Informe a placa do carro: ");
  carro.placa = sc.nextInt();

  System.out.println("Informe o ano de fabricação: ");
  carro.ano = sc.nextInt();
  sc.nextLine();

  System.out.println("Informe a cor do carro: ");
  carro.cor = sc.nextLine();

  System.out.println("O carro da sua escolha é: ");

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
