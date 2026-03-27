package com.atividade.app;

import java.util.Scanner;

import com.models.Aluno;
import com.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 05
        // Utilizando os conceitos básicos de orientação a objetos, crie um
        // programa que um aluno informa seus dados ( nome, idade e email) e pede
        // para um professor (dados: nome e matrícula) calcular parar ele as
        // seguites fórmulas: área do triângulo, área do círculo e equação do 1º
        // grau, e exibe o resultado na tela.
        // NOTE: Crie as classes Aluno e Professor no package models.

        // Instanciando os objetos
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        //  variáveis
        double x;
        double y;
        double operador;
        

        // Interação com o aluno
        System.out.println(" Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println(" Informe o email do aluno: ");
        aluno.email = sc.nextLine();
        System.out.println(" Informe a idade do aluno: ");
        aluno.idade = sc.nextDouble();
        sc.nextLine();

        
        
        prof.nome = "Alex machado";
        
        prof.matricula = "kkk-kkk";


        System.out.println(prof.darBoasvindas());



        do{
        System.out.println(" Escolha uma  das opções abaixo que o :" + prof.nome + " pode resolver. ");
        System.out.println("1 - Calcular a Área do triangulo: ");             
        System.out.println("2 - Calcular a Área de um círculo : ");             
        System.out.println("3 - Calcular uma função do 1º grau: ");
        System.out.println("4 - Encerrar o programa: ");
        operador = sc.nextDouble();

        if (operador == 1){
            System.out.println(" Digite o valor da Base: ");
            x = sc.nextDouble();
            System.out.println(" Digite o valor da altura: ");
            y = sc.nextDouble();
            System.out.println("Area é igual a " + prof.areaTriangulo(x, y));
        }
        if (operador == 2) {
            System.out.println(" Digite o valor do raio ");
            x = sc.nextDouble();
            System.out.println("O valor da Area é igual a " + prof.areaCirculo(x));
           

        }
        if(operador == 3){
            System.out.println("digite o valor de A: ");
            x = sc.nextDouble();
            System.out.println("digite o valor de B: ");
            y = sc.nextDouble();
            System.out.println((x!= 0) ? "A raiz da equação é " + prof.equacaoPriGrau(x, y)
        : "Coeficiente A não pode ser 0.");


        }

        } while (operador !=4);
        System.out.println("Obrigado por usar o programa");

        
        sc.close();





        
    }
}
