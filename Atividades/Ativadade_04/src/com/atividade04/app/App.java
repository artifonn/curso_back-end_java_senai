package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  TODO: ATIVIDADE 04
        // Desenvolva um programa que crie um objeto da classe Veiculo
        // (pode ser qualquer veiculo) com atributos:
        // - Fabricante
        // - Modelo
        // - Placa
        // - Ano
        // - Cor
        //Programa deverá mostrar os dados do veiculo
        // NOTE: veiculo nao mostra dados, portando nao pode ser via metodo
        // NOTE: usuario devera informar os dados do veiculo
        
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();


        // Entrada de dados do veiculo
        System.out.println("Olá, informe os dados do veiculo por favor");
        System.out.println("Informe o fabricante do seu veiculo: ");
        veiculo.fabricante = sc.nextLine();
        System.out.println("Informe o modelo do seu veiculo: ");
        veiculo.modelo = sc.nextLine();
        System.out.println("Informe a placa do seu veiculo: ");
        veiculo.placa = sc.nextLine();
        System.out.println("Informe a cor do seu veiculo: ");
        veiculo.ano = sc.nextLine();



        veiculo.Saudar();
        veiculo.especificar();







    }
}
