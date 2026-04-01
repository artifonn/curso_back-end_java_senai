package com.polimorfismo.app;

import java.util.Scanner;

import com.polimorfismo.models.PessoaFisica;
import com.polimorfismo.models.PessoaJuridica;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);



        empresa.nomeFantasia = "Cafeteria Café Tão Gostoso";
        empresa.cnpj = "34.671.861/0001-13";
        empresa.email = "cafetaogostoso@contato.com.br";
        empresa.telefone = "(61) 9 9876-4321";

        System.out.println("Dados do usuário: ");
        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o cpf: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println(" \nDados da usuario\n");
        usuario.exibirDados();
        System.out.println("\nDados da Empresa\n");
        empresa.exibirDados();




    
        sc.close();
        
    }
}
