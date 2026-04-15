package com.apresentar.app;

import javax.swing.JOptionPane;

import com.apresentar.models.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa usuario = new Pessoa(null, null, 0);

        // Entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu email:"));
        
        // Saída de dados
        JOptionPane.showMessageDialog(null, usuario);

        


    }
}
