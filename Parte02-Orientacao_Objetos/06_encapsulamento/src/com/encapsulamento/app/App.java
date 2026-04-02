package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		PessoaFisica usuario = new PessoaFisica(null, null, null, null);
		PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);


		// Dados da empresa
		System.out.println("============ DADOS DA EMPRESA ==========");
		empresa.setNomeFantasia("Javax LTDA");
		empresa.setCnpj("789.659/0001-59");
		empresa.setEmail("javax@gmail.com");
		empresa.setTelefone("(61)99966-8877");

		// Dados do usuario
		System.out.println("============ Informe os dados ==========");
		System.out.println("Informe o nome:");
		usuario.setNome(sc.nextLine());
		System.out.println("Informe o CPF: ");
		usuario.setCPF(sc.nextLine());
		System.out.println("Informe o e-mail:");
		usuario.setEmail(sc.nextLine());
		System.out.println("Informe o telefone:");
		usuario.setTelefone(sc.nextLine());

		System.out.println("============ Dados do usuário ==========");

		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("E-mail do usuário: " + usuario.getEmail());
		System.out.println("CPF do usuário: " + usuario.getCPF());
		System.out.println("Telefone do usuário: " + usuario.getTelefone());

		System.out.println("============ Dados da Empresa ==========:");
		System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
		System.out.println("CNPJ da empresa: " + empresa.getCnpj());
		System.out.println("E-mail da empresa: " + empresa.getEmail());
		System.out.println("Telefone da empresa: " + empresa.getTelefone());

		sc.close();
	}
}
