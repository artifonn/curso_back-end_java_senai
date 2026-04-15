package com.atividade.app;

import com.atividade.models.Pessoa;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {

        // TODO: atividade 08
        // Crie um programa que recebe do usuario os valores dos atributos o nome e idade em JOoptionPane, e o pragrama
        // informa se o usuário é maior ou menor de idade.
        

        Pessoa pessoa = new Pessoa(null, 0);

        // Entrada de dados

        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        pessoa.setIdade(Double.parseDouble(JOptionPane.showInputDialog("Informe a idade: ")));

        // Saída de dados

        JOptionPane.showMessageDialog(null, pessoa.getNome() + pessoa.verificarIdade());
        

       


    }
}
