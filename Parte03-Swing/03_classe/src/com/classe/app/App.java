package com.classe.app;

import javax.swing.JOptionPane;

import com.classe.models.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando a classe pessoa 
        Pessoa pessoa = new Pessoa(null, null, null, 0, 0);

        // entrada de dados

        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("informe a altura em metros").replace(",",".")));

        pessoa.setCpf(JOptionPane.showInputDialog("Informe o cpf"));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o e-mail:"));


        // Saída de dados

        JOptionPane.showMessageDialog(null, 
            "Nome: " + pessoa.getNome() +
            "\n Idade:" + pessoa.getIdade() +
            "\nAltura: " + pessoa.getAltura() +
            "m\nCPF: " + pessoa.getCpf() +
            "\nE-mail:" + pessoa.getEmail()      
        );
        

    }
}
