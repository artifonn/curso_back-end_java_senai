package com.atividade09.app;

import com.atividade09.models.Combustivel;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
		Combustivel combustivel = new Combustivel(0, 0);

		String[] opcoes = {"Etanol", "Gasolina", "Calcular", "Sair" };
		Object opcao;
		String opcaoSelecionada;

		do {
			opcao = JOptionPane.showInputDialog(
					null,
					"Escolha uma opção:",
					"Melhor combustivel",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoes,
					opcoes[0]);

			opcaoSelecionada = (String) opcao;

			switch (opcaoSelecionada) {
				case "Etanol":
					combustivel.setprecoEtanol(
							Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",", ".")));
					break;
				case "Gasolina":
					combustivel.setprecoGasolina(
							Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",", ".")));
					break;
				case "Calcular":
					JOptionPane.showMessageDialog(null, combustivel.melhorCombustivel());
					break;
			}
		} while (!opcao.equals("Sair"));

	}
}
