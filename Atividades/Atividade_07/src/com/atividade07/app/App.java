package com.atividade07.app;

import java.util.Scanner;

import com.atividade07.models.ContaPF;
import com.atividade07.models.ContaPJ;
import com.atividade07.models.PessoaFisica;
import com.atividade07.models.PessoaJuridica;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    PessoaFisica pf = new PessoaFisica(null, null, null);
    ContaPF ccPF = new ContaPF("1234 ", "897456", 0, pf);

    PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
    ContaPJ ccpj = new ContaPJ(null, null, 0, pj);

    String pessoaTipo;
    String opcao = null;
    double valor;

    System.out.println("Escolha o tipo de pessoa que deseja cadastrar:");
    System.out.println("PF - Pessoa Física | PJ - Pessoa Jurídica");
    pessoaTipo = sc.nextLine();

    switch (pessoaTipo) {
      case "PF":

        System.out.println("Informe o titular da conta:");
        pf.setNome(sc.nextLine());
        System.out.println("Informe o CPF do titular:");
        pf.setCpf(sc.nextLine());
        System.out.println("Inform o e-mail do titular:");
        pf.setEmail(sc.nextLine());

        ccPF.setPf(pf);
        break;
      case "PJ":
        System.out.println("Razão Social: ");
        pj.setRazaoSocial(sc.nextLine());
        System.out.println("Nome Fantasia:");
        pj.setNomeFantazia(sc.nextLine());
        System.out.println("CNPJ:");
        pj.setCnpj(sc.nextLine());
        System.out.println("E-mail da empresa:");
        pj.setEmail(sc.nextLine());
        sc.nextLine();

        ccpj.setPj(pj);
      default:
        System.out.println("Pessoa 404!");
        if ("PF".equals(pessoaTipo) || "PJ".equals(pessoaTipo)) {
          do {
            System.out.println("-------- Opção do Roubank --------");
            System.out.println("1 - Dados da conta | 2 - Fazer depósito | 3 - Fazer saque | 4 - Sair do programa");
            opcao = sc.nextLine();

            switch (opcao) {
              case "1":
                if ("PF".equals(pessoaTipo)) {
                  ccPF.exibirDados();
                } else {
                  ccpj.exibirDados();
                }
                break;
              case "2":
                System.out.println("Informe o valor do deposito em R$:");
                valor = sc.nextDouble();
                if ("PF".equals(pessoaTipo)) {
                  if (valor > 0) {
                    System.out.println("Valor depositado com sucesso!");
                    System.out.println("Saldo atual: R$ " + ccpj.fazerDeposito(valor));

                  } else {
                    System.out.println("Valor inválido.");
                  }
                  sc.nextLine();

                  if (valor > 0) {
                    System.out.println("Saudo atual: R$" + ccPF.fazerDeposito(valor));
                  } else {
                    System.out.println("Valor inválido.");
                  }
                }
                break;
              case "3":
                System.out.println("Informe o valor do saque:");
                valor = sc.nextDouble();

                sc.nextLine();

                if ("PF".equals(pessoaTipo)) {
                  if (valor > 0 && valor <= ccPF.getSaldo()) {
                    System.out.println("Saque efetudo com sucesso.");
                    System.out.println("Saldo atual: R$" + ccPF.fazerSaque(valor));
                  }
                  else {
                    if (valor > 0 && valor <= ccpj.getSaldo()) {
                      System.out.println("Saque efetuado com sucesso. ");
                      System.out.println("Saldo atual: R$" + ccpj.getSaldo());
                    }
                  }
                }
            }
          } while (!"4".equals(opcao));
        } else {
          System.out.println("Não foi possível Cadastar novo titular.");
          System.out.println("Programa encerrado.");
        }

    }
    sc.close();
  }
}
