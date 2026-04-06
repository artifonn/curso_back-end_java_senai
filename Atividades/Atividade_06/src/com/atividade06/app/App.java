package com.atividade06.app;

import java.util.Scanner;
import com.atividade06.models.*;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String opcao = "";

    while (!opcao.equals("5")) {
      System.out.println("\n--- JavaCar Locadora ---");
      System.out.println("1 - Carro | 2 - Moto | 3 - Ônibus | 4 - Caminhão | 5 - Sair");
      System.out.print("Escolha: ");
      opcao = sc.nextLine();

      if (opcao.equals("5"))
        break;

      // Dados comuns 
      System.out.print("Fabricante: ");
      String fab = sc.nextLine();
      System.out.print("Modelo: ");
      String mod = sc.nextLine();
      System.out.print("Cor: ");
      String cor = sc.nextLine();
      System.out.print("Ano: ");
      String ano = sc.nextLine();
      System.out.print("Placa: ");
      String pla = sc.nextLine();

      Veiculo v;

      switch (opcao) {
        case "1":
          System.out.print("Capacidade do Bagageiro (L): ");
          String bag = sc.nextLine();
          v = new Carro(fab, mod, cor, ano, pla, bag);
          break;
        case "2":
          System.out.print("Cilindradas: ");
          String cil = sc.nextLine();
          v = new Moto(fab, mod, cor, ano, pla, cil);
          break;
        case "3":
          System.out.print("É leito? (Sim/Não): ");
          String lei = sc.nextLine();
          v = new Onibus(fab, mod, cor, ano, pla, lei);
          break;
        case "4":
          System.out.print("Tipo de Carroceria: ");
          String car = sc.nextLine();
          v = new Caminhao(fab, mod, cor, ano, pla, car);
          break;
        default:
          System.out.println("Opção inválida!");
          continue;
      }

      // Exibição Final
      System.out.println("\n=== DADOS DO VEÍCULO CADASTRADO ===");
      System.out.println("Categoria:  " + v.getCategoria());
      System.out.println("Fabricante: " + v.getFabricante());
      System.out.println("Modelo:     " + v.getModelo());
      System.out.println("Cor:        " + v.getCor());
      System.out.println("Placa:      " + v.getPlaca());

      // Mostrar o atributo extra de cada um
      if (v instanceof Carro)
        System.out.println("Bagageiro:  " + ((Carro) v).getCapacidadeBagageiro());
      else if (v instanceof Moto)
        System.out.println("Cilindradas: " + ((Moto) v).getCilindradas());
      else if (v instanceof Onibus)
        System.out.println("Tipo Leito: " + ((Onibus) v).getTipoLeito());
      else if (v instanceof Caminhao)
        System.out.println("Carroceria: " + ((Caminhao) v).getTipoCarroceria());
    }
    sc.close();
    System.out.println("Sistema encerrado.");
  }
}