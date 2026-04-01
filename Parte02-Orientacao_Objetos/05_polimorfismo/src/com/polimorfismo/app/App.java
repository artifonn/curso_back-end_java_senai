package com.polimorfismo.app;

import java.util.Scanner;

import com.models.PessoaFisica;
import com.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(null, null, null, null, 0);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.nomeFantasia = "Cafeteria Javax";
        empresa.CNPJ = "18.214.969/0001-20";
        empresa.email = "cafeteriajavax@gmail.com";
        empresa.telefone = "(61)99988-7766";


        // Dados do Usuário
        System.out.println("========== Dados do usuário: ==========");
        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();

        System.out.println("Informe o CPF:");
        usuario.cpf = sc.nextLine();

        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();

        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();

        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println("========== Dados do Usuário ==========");
        usuario.exibirDados();
        
        System.out.println("\nDados da Empresa");
        empresa.exibirDados();

        sc.close();

    }
}
