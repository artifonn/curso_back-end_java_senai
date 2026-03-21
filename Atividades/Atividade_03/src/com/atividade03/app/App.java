package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 03
        // Recrie o programa da calculadora feito no dia 18/03/2026,
        // (switch...case) mas desta vez acrescentando a opção de encerrar
        // o programa quando o usuario quiser

        Scanner sc = new Scanner(System.in);


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

    do {
     // Menu
    System.out.println("Informe a operação desejada: ");
    System.out.println("0 Sair do Programa");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação: ");
    System.out.println("4 - Divisão: ");
    
    operador = sc.nextLine();


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
    
    } while (operador != 0);





    }
}
