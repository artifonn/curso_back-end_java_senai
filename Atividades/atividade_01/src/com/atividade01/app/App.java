package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Crie um programa que receba do usuário: nome, peso e altura,
        // e exiba na tela o valor de seu IMC e o seu diagnostico
        // Cálculo do IMC: peso/(altura * altura);
        // Diagnoticos: IMC menor que 18.5 = abaixo do peso
        // IMC entre 18.5 e 25 = peso ideal
        // IMC entre 25 e 30 = acima do peso
        // IMC entre 30 e 35 = obeso
        // IMC entre 35 e 40 = obesidade nivel 2
        // IMC acima de 40 = obesidade mórbida

        String nome;
        double peso;
        double altura;
        double result;

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe o seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Informe a sua altura");
        altura = scanner.nextDouble();

        result = peso/(altura * altura);
        String resultadoFormatado = String.format("%.2f", result);

        if (result >= 18.5 && result < 25) {
            System.out.println(nome + " você está no peso ideal");
        } else if (result >= 25 && result < 30)  {
            System.out.println(nome + " o seu IMC é " + resultadoFormatado + " você está acima do peso");
        } else if (result >= 30 && result < 35) {
            System.out.println(nome + " o seu IMC é " + resultadoFormatado + " você está obeso");
        } else if (result >= 35 && result < 40) {
            System.out.println(nome + " o seu IMC é " + resultadoFormatado +" o seu IMC é " +" você está com obesidade nível 2");
        } else {
            System.out.println(nome + " o seu IMC é " + resultadoFormatado + " você está com obesidade mórbida");
        }

        scanner.close();

    }
}
