import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    String nome;
    double peso;
    double altura;
    int opcao;

  
    do {
      System.out.println("Deseja registrar novo pagante? ");
      System.out.println("1 - Registrar nova entrada");
      System.out.println("2 - Sair do programa");
      opcao = sc.nextInt();

      if (opcao == 1) {
        sc.nextLine();

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe o seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Informe a sua altura: ");
        altura = sc.nextDouble();

        System.out.println("**** Perfil do Aluno ****");
        System.out.println(nome);
        System.out.println(peso);
        System.out.println(altura);
        
        if (peso < 120 && altura >= 1.25) {
          System.out.println("****Entrada de " + nome + " altorizada!****\n");
        } else {
          System.out.println("**** Entrada de " + nome + " não altorizada!****\n");
        }


      } else if (opcao == 2) {
        System.out.println("Encerrando...");
      } else {
        System.out.println("Opção inválida!");
      }
       
    } while(opcao != 2);

      sc.close();
  }
}
