package com.metodos.app;

import java.util.Scanner;

import com.metodos.models.Professor;
import com.metodos.models.Aluno;;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando os objetos criados.
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno aluno = new Aluno();
        // Declaração de variáveis

        double x;
        double y;

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        // boa vindas para o aluno
        System.out.println(aluno.apresentar());

        prof.nome = " Alex o Machada.";
        prof.materia = " Matemática ";

        System.out.println(prof.darBoasVindas());

        System.out.println(" Informe o valor da base: ");
        x = sc.nextDouble();
        System.out.println(" Informe o valor da altura: ");
        y = sc.nextDouble();

        System.out.println(" A área do quadrilátero é " + prof.areaQuadrilatero(x, y)); 
        
        
        sc.close();


    }
}
