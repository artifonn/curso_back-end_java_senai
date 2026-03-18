package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 01
        // Crie um programa que receba do usuario: nome, peso e altura,
        // e exiba na tela o valor de seu IMC e o seu diagnóstico.
        // Cálculo do IMC: peso/(altura*altura)
        // Diagnóstico: imc menor que 18.5 = abaixo do peso
        // imd entre 18.5 e 25 = peso ideial
        // imc entre 25 e 30 = acima do peso
        // imc entre 30 e 35 = obeso 
        // imc entre 35 e 40 = obesidade nivel 2
        // imc maior que 40 = obesidade mórbida
        


        // Criando a instancia Scannner

        Scanner sc = new Scanner(System.in);

        String nome;
        String resultadoFormatado;
        double peso;
        double altura;
        double result;

        // Entrada de dados 

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em kg:  ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em mentros:  ");
        altura = sc.nextDouble();

        result= peso/(altura*altura);
        resultadoFormatado = String.format("%.2f", result);

        
        if (result < 18){
            System.out.println(nome +" Seu IMC É" + resultadoFormatado + "você está abaixo do peso ");

        } else if(result < 25){          
              System.out.println(nome + ", Seu IMC é " + resultadoFormatado + ". Portanto, você está no peso ideial");

        } else if (result < 30){
            System.out.println(nome + ", Seu IMC é  " + resultadoFormatado + ". Portanto, você está acima do peso");
        }
        else if (result < 35){
            System.out.println(nome + ", Seu IMC é " + resultadoFormatado + " Portanto, Você está obeso");
        }
        else if(result < 40){
            System.out.println(nome + ", Seu IMC é  " + resultadoFormatado + ". Portando, você está com obesidade nível 2");
        }
        else{
            System.out.println(nome + ", Seu IMC é " + resultadoFormatado +  ". Então, você está com obesidade mórbida");
        }




        // Fecha o objeto Scanner
        sc.close();




    }
}
