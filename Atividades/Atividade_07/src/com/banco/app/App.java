package com.banco.app;

import com.banco.models.ContaPF;
import com.banco.models.ContaPj;
import com.banco.models.PessoaFisica; 
import com.banco.models.PessoaJuridica;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // TODO: atividade 07
        // Crie um programa de aplicativo de banco: o usuario poderá escolher se 
        // deseja entrar como pessoa física ou pessoa jurídica, deverá informar o nome,
        // email CPF (classe PessoaFisica), ou nome fantasia, razao social, email e cnjp (classe PessoaJuridica),
        //  e o programa deverá informar a agência e conta (classe Conta) do titular (uma única vez durante todo o
        // programa). Em seguida, o programa deverá exibir as opções para o usuário: consultar dados da conta, fazer
        // saque, fazer depósito, sair do programa. O programa deverá cobrar uma taxa de 0,01% em cima de cada saque feito 
        // pela pessoa juridica . Qualquer saque só poderá ser feito caso o valor do saque seja menor ou igual ao saldo da conta
        // NOTE: Use os 4 pilares da orientacao a objeto, mais interface e composicao. E o mais importante: DIVIRTAM-SE!!!!

        Scanner sc = new Scanner(System.in);


        System.out.println("======================================= ");
        System.out.println("|Olá, seja bem vindo ao banco duvidoso| ");
        System.out.println("=======================================");



        do {
        
        System.out.println("Selecione uma das opções abaixo");

        System.out.println("Pessoa fisica");
        System.out.println("Pessoa Juridica");       
        String tipoPessoa = sc.nextLine().trim();;


        if (tipoPessoa.equalsIgnoreCase("Pessoa fisica")){

            PessoaFisica pf = new PessoaFisica(null, null, null);

            System.out.println("Digite seu nome:");
            pf.setNome(sc.nextLine());
            System.out.println("Digite seu email:");
            pf.setEmail(sc.nextLine());
            System.out.println("Digite seu cpf");
            pf.setCpf(sc.nextLine());

        }
        else if ( tipoPessoa.equalsIgnoreCase("Pessoa juridica")){
            
            PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
            
            System.out.println("Digite o nome fantasia:");
            pj.setNomeFantasia(sc.nextLine());

            System.out.println("Digite a razão social:");
            pj.setRazaosocial(sc.nextLine());

            System.out.println("Digite o email:");
            pj.setEmail(sc.nextLine());


        }
        else {
            System.out.println("Opção inválida.");
        }
        

            
        } while (condition);

        

        




        
        


        sc.close();
        
    }
}
