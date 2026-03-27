package com.models;

public class Professor {
    // atributos
    public String nome;
    public String matricula;
    public double a;
    public double b;

    // Se apresentar
    public String darBoasvindas() {
        return "Olá meu nome é " + this.nome + " e minha matricula é " + this.matricula + ".";
    }
        
    // Metodos 

    public double areaTriangulo(double x, double y){
        return x*y/2;
    }

    public double areaCirculo(double x){
        return Math.PI * Math.pow(x, 2);
    }

    // a*x + b = 0

    public funcaoAfim(double a, double b){
        this.a = a;
        this.b = b;
    }
        

    public double equacaoPriGrau(double x, double y){
        return 

    }



}
