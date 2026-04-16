package com.atividade.app;

import javax.swing.JOptionPane;

import com.atividade.models.*;

public class App {


    public static void main(String[] args) throws Exception {
        
        // TODO: Atividade 09
        // Faça um programa com JOptionPane que receba do usuário os valores dos 
        // combustíveis etanol e gasolina, e exiba qual o melhor combustível para
        // abastecer. O usuário deverá ter a opção de entrar com o valor do 
        // etanol, da gosolina, mostrar melhor combustível ou sair do programa.

        Combustivel tanque = new Combustivel(0, 0);

        String [] opcoes = {"Etanol", "Gasolina", "Calcular", "Sair"};
        Object opcao;
        String opcaoEscolhida;


        do {
            opcao = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção",
                "Melhor combustível",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            opcaoEscolhida = (String) opcao;


            switch (opcaoEscolhida) {
                case "Etanol":
                    tanque.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Etanol: ").replace(",",".")));    
                
                    break;

                case "Gasolina":
                    tanque.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina: ").replace(",",".")));

                    break;

                case "Calcular":
                    JOptionPane.showConfirmDialog(null, tanque.melhorCombustivel());
            
                default:
                    break;
            }
        } while  (opcao !="Sair");




    }
}
