package com.entrada.app;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        
        // Declaracao de variaveis

        String nome;

        // Entrada de dados
        nome = JOptionPane.showInputDialog("Informe Seu Nome: ");

        // Saída de dados

        JOptionPane.showMessageDialog(null, "Meu nome é : " + nome);


    }
}
