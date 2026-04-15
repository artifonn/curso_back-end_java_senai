package com.lista.app;

import javax.swing.JOptionPane;

import com.lista.models.Calculadora;

public class App {
  public static void main(String[] args) throws Exception {
    Calculadora calc = new Calculadora(0, 0);

    String[] opcoes = { "Soma", "Subtração", "Multiplicação", "Divisão", "Sair" };
    Object opcao;
    String opcaoSelecionada;

    do {
      opcao = JOptionPane.showInputDialog(
          null,
          "Selecione uma Opção:",
          "Opções",
          JOptionPane.QUESTION_MESSAGE,
          null,
          opcoes,
          opcoes[0]);

      if (!opcao.equals("Sair")) {
        calc.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe um número:")));
        calc.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe um número:")));

        opcaoSelecionada = (String) opcao;

        switch (opcaoSelecionada) {
          case "Soma":
            JOptionPane.showMessageDialog(null, "Soma: " + calc.somar());
            break;
          case "Subtração":
            JOptionPane.showMessageDialog(null, "Subtrair: " + calc.subtrair());
            break;

          case "Multiplicação":
            JOptionPane.showMessageDialog(null, "Multiplicar: " + calc.multiplicar());
            break;

          case "Divisão":
            JOptionPane.showMessageDialog(null, "Divisão: " + calc.dividir());
            break;
        }

      } else {
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
      }

    } while (opcao != "Sair");
  }
}
