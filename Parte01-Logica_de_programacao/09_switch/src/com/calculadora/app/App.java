package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //    instacia a classe Scanner
    Scanner sc = new Scanner(System.in);

    // Declaracao de variaveis
    double num1;
    double num2;
    double result;
    String operador;


    // entrada de dados
    System.out.println("Infome o 1º número: ");
    num1 = sc.nextDouble();
    System.out.println("Informe o 2º número: ");
    num2 = sc.nextDouble();
    // Limpeza do buffer
    sc.nextLine();

    // Menu
    System.out.println("Informe a operação desejada: ");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação: ");
    System.out.println("4 - Divisão: ");
    operador = sc.nextLine();


    // verifica a operação desejada
    switch (operador) {
        case "1":
            result = num1 + num2;
            System.out.println("O valor da soma é " + result);
            break;
        case "2":
            result = num1 - num2;
            System.out.println("O valor Subtração é " + result);
            break;
        case "3":
            result = num1 * num2;
            System.out.println("O valor da multiplicação é " + result);
            break;
        case "4":
            result = num1 / num2;
            System.out.println("O valor da divisão é " + result);
            break;
    
        default:
            System.out.println("Operacao inválida.");
            
    }   
    



    // fechar o objeto
    sc.close();

    }
}
