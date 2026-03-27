package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.Aluno;
import com.atividade05.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        
        int opcao; 
        double x;
        double y;
        double raio;
        double a = 0;
        double b = 0;

        System.out.println(prof.darBoasVindas());
        
        System.out.println("Informe o seu nome: ");
        aluno.nome = sc.nextLine();
        
        System.out.println("Informe a sua idade: ");
        aluno.idade = sc.nextLine();
        
        System.out.println("Informe o seu e-mail");
        aluno.email = sc.nextLine();
        
        
        do {
                System.out.println("O que você deseja calcular? ");
                System.out.println("1 - Área do Triângulo");
                System.out.println("2 - Área do Círculo");
                System.out.println("3 - Equação do 1° Grau");
                System.out.println("4 - Encerrar");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Informe o valor da base (x)");
                    x = sc.nextDouble();
                    System.out.println("Informe o valor da altura (y)");
                    y = sc.nextDouble();
                    System.out.println("Área do Triângulo: " + prof.caclTriangulo(x, y));
                } 
                if(opcao == 2){
                    System.out.println("Informe o raio da circunferencia: ");
                    raio = sc.nextDouble();
                    System.out.println("Área do Círculo:" + prof.calcularRaio(raio));
                }
                if (opcao == 3) {
                    System.out.println("Informe o valor de a: ");
                    a = sc.nextDouble();
                    System.out.println("informe o valor de b:");
                    b = sc.nextDouble();
                    if (a != 0) {
                        System.out.println(prof.calcularEquacao(a, b));
                    } else {
                        System.out.println("Não é uma equação de primeiro grau.");
                    }              
                }

            } while (opcao != 4);

            System.out.println("Encerrando...");


            sc.close();

    }
}
