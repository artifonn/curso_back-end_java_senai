package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instanciar o objeto
        Scanner sc = new Scanner(System.in);
        
        // Declaracao de variavel
        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = sc.nextInt();

        // Laço de repetição while

        while (numero >= 0 ) {
            System.out.println(numero);
            numero--;
            
        }



        // fecha o objeto
        sc.close();
        
    }
}
