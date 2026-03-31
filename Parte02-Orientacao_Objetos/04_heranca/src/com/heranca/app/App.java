package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // Dados da empresa
        empresa.razaoSocial = "Javax SA";
        empresa.nomeFantasia = "Javax SA";
        empresa.CNPJ = "55.000.000/0001-99";
        empresa.email = "javax@contato.comb.br";
        empresa.telefone = "(61)99988-8877";
        empresa.endereco = "Brasilia - DF";
        empresa.website = "www.javax.com.br";

        // Dados do Usuário
        System.out.println("==== Dados do Usuário =====");
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = sc.nextLine();
        
        System.out.println("Infomre o CPF do usuário: ");
        usuario.cpf = sc.nextLine();

        System.out.println("Informe o e-mail do usuário: ");
        usuario.email = sc.nextLine();

        System.out.println("Informe o telefone do usuário: ");
        usuario.telefone = sc.nextLine();

        System.out.println("Informe a idade do usuário: ");
        usuario.idade = sc.nextInt();

        System.out.println("=========");

        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();
    }
}
