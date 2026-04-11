package com.banco.app;

import com.banco.models.ContaPF;
import com.banco.models.ContaPj;
import com.banco.models.PessoaFisica; 
import com.banco.models.PessoaJuridica;

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
        PessoaFisica pf = new PessoaFisica(null, null, null);
        ContaPF ccpf = new ContaPF("1234 -5", "10101-1", 0, pf);

        PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
         ContaPj ccpj = new ContaPj("1234-5", "20101-1", 0, pj);

        String opcao = null;
        double valor;


        System.out.println("======================================= ");
        System.out.println("|Olá, seja bem vindo ao banco duvidoso| ");
        System.out.println("=======================================");

        System.out.println("Selecione uma das opções abaixo");

        System.out.println("PF - Pessoa fisica");
        System.out.println("PJ - Pessoa Juridica");       
        String tipoPessoa = sc.nextLine();

        switch (tipoPessoa) {
            case "PF":
                System.out.println("Informe o nome do titular: ");
                pf.setNome(sc.nextLine());
                System.out.println(" Informe o CPF do titular:");
                pf.setCpf(sc.nextLine());
                System.out.println("Informe o E-mail do titular: ");
                pf.setEmail(sc.nextLine());

                ccpf.setPf(pf);
                break;
            case "PJ":
                System.out.println("Informe a razao social da empresa: ");
                pj.setRazaosocial(sc.nextLine());
                System.out.println("Informe o nome fantasia da empresa: ");
                pj.setNomeFantasia(sc.nextLine());
                System.out.println("Informe o CNPJ da empresa : ");
                pj.setCnpj(sc.nextLine());
                System.out.println("Informe o email da empresa: ");
                pj.setEmail(sc.nextLine());


                ccpj.setPj(pj);
            
            default:
                System.out.println("Pessoa 404 ");
                break;
        }




        if ("PF".equals(tipoPessoa) || "PJ".equals(tipoPessoa)) {
            do {
            // Menu
            System.out.println("----Opções do Roubanck------");
            System.out.println("1 - Consultar dados da conta: ");
            System.out.println("2 - Fazer depósito");
            System.out.println("3 - fazer Saque ");
            System.out.println("4 - Sair do Programa");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    if ("PF".equals(tipoPessoa)){
                        ccpf.consultarDados();
                    }
                    else {
                        ccpj.consultarDados();
                    }
                    
                    break;
                case  "2":
                    System.out.println("Informe o valor do deposito em R$: ");
                    valor = sc.nextDouble();

                    sc.nextLine();

                    if ("PF".equals(tipoPessoa)){
                            if (valor > 0){
                            System.out.println("Valor depositado com sucesso. ");
                            System.out.println("Saldo atual: R$" + ccpf.fazerDeposito(valor));
                        }
                        else {
                            System.out.println("Valor inválido");
                        }
                    }
                    else {
                        if (valor > 0){
                            System.out.println("Valor depositado com sucesso.");
                            System.out.println("Saldo atual: R$" + ccpj);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Informe o valor do saque em R$");
                    valor = sc.nextDouble();

                    sc.nextLine();

                    if ("PF".equals(tipoPessoa)){
                            if (valor > 0 && valor <= ccpf.getSaldo()){
                            System.out.println("Saque efetuado com sucesso.");
                            System.out.println("Saldo atual:" + ccpf.sacar(valor));
                        }
                        else{
                            System.out.println("Valor do saque invalido.");
                        }
                    }
                    else{
                        if(valor > 0 && valor <= ccpj.getSaldo()){
                            System.out.println("Saque efetuado com sucesso.");
                            System.out.println("Saldo atual:" + ccpj.sacar(valor));
                        }
                        else{
                            System.out.println("Valor do saque invalido.");
                        }

                    }
                    break;
                    case "4":
                        System.out.println("Programa encerrado.");
                        System.out.println("Volte sempre");
                        break;
                default:
                    System.out.println("Opcão Invalida");
                    break;
            }
        } while (!"4".equals(opcao));
        }
        else {
            System.out.println("Não foi possível cadastrar novo titular. ");
            System.out.println("Programa encerrado. ");
        }
        
        
        

        




        
        


        sc.close();
        
    }
}
