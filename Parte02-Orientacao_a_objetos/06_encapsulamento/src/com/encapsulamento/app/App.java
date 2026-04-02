package com.encapsulamento.app;

import java.util.Scanner;
import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       PessoaFisica usuario = new PessoaFisica(null,null, null, null);
       PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);


    // Dados da empresa
    empresa.setNommeFantasia("Funerária você é o Próximo");
    empresa.setCnpj("11.173.763/0001-50");
    empresa.setEmail("funeraria@contato.com.br");
    empresa.setTelefone("(61) 99999-9999");

    // Dados do usuario
    System.out.println("Informe o nome: ");
    usuario.setNome(sc.nextLine());
    System.out.println("Informe cpf");
    usuario.setCpf(sc.nextLine());
    System.out.println("informe seu email: ");
    usuario.setEmail(sc.nextLine());
    System.out.println("Informe seu telefone: ");
    usuario.setTelefone(sc.nextLine());

    
    // saída de dados
    System.out.println("\nDADOS DO USUARIO\n");
    System.out.println("Nome do usuario: " + usuario.getNome());
    System.out.println("CPF do usuario :  " + usuario.getCpf());
    System.out.println("E-mail do usuario:  " + usuario.getEmail());
    System.out.println("Telefone do usuario: " + usuario.getTelefone());

    System.out.println("\nDADOS DA EMPRESA\n");
    System.out.println("Nome da empresa:" + empresa.getNommeFantasia());
    System.out.println("CNPJ da Empresa: " + empresa.getCnpj());
    System.out.println("E-mail da empresa: " + empresa.getEmail());
    System.out.println("Telefone da empresa" + empresa.getTelefone());


    sc.close();

    }
}
