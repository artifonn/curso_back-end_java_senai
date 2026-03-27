package com.atividade05.models;

public class Professor {

    public String nomeProfessor = "Alex";
    public String matriculaProfessor = "Abc123";


    public String darBoasVindas() {
        return "Olá, meu nome é " + this.nomeProfessor + " minha matricula é " + this.matriculaProfessor + ".";
    }
    
    public String nomeProfessor() {
        return this.nomeProfessor;
    }

    public String matriculaProfessor() {
        return this.matriculaProfessor;
    }

    // Fórmula Geral: (Base * Altura / 2).
    public double caclTriangulo(double x, double y) {
        return (x * y) / 2;
    }

    // Fórmula geral:
    public double calcularRaio(double raio) {
        return raio = (Math.PI * Math.pow(raio, 2));
    }
    // a * x + b = 0
    public double calcularEquacao(double a, double b) {
       return -b / a;
    }
}
