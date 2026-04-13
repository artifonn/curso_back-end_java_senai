package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    // Declaração de variável
    String nome;


    // Input
    nome = JOptionPane.showInputDialog("Informe o seu nome:");

    JOptionPane.showMessageDialog(null, "Meu nome é " + nome + "!");
    
  }
}
