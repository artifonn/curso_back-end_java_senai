package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Usuario;

public class App {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        Usuario usuario = new Usuario(nome, idade);

        String status = (usuario.getIdade() >= 18) ? "maior de idade" : "menor de idade";

        String mensagem = String.format(
            "Usuário: %s\nIdade: %d anos\nStatus: %s", 
            usuario.getNome(), 
            usuario.getIdade(), 
            status
        );
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
