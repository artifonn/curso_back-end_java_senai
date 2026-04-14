package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario(null, 0);

        usuario.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));

        JOptionPane.showConfirmDialog(null, "Nome: " + usuario.getNome() +
                "\nIdade: " + usuario.getIdade());

    }
}
