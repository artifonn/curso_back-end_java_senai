package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();



        // Dados da empresa
        empresa.razaosocial = "valtim LTDA";
        empresa.nomeFantasia = "Kids Graça Eventos Infantis";
        empresa.Cnpj = "51.438.999/0001-96";
        empresa.telefone = "(61) 99494-3233";
        empresa.endereco = "Campo da Esperança";
        empresa.website = "kidsgraça.com.br";


        // dados do usuario
        System.out.println("Dados do usuário: ");
        System.out.println("informe o nome do usuario: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o cpf do usuario: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o email do usuario: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone do usuario: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o endereço do usuario: ");
        usuario.endereco = sc.nextLine();
        System.out.println("Informe a idade do usuario: ");
        usuario.idade = sc.nextInt();


        // saída de dados
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));



        sc.close();        
        
    }
}
