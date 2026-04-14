package com.entrada.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Usuario;

public class App {
  public static void main(String[] args) throws Exception {

    Usuario usuario = new Usuario(null, 0);
    
    // Input
    usuario.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
    usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));

    JOptionPane.showConfirmDialog(null, usuario.getNome() + usuario.verificaIdade());
    
  }
}
