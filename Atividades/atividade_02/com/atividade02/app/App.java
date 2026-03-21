import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // **********************************************
        // Crie um programa que recebe do usuário o nome e a idade (1x)
        // e depois exiba uma lista de filmes:
        // Sala 01 - A Roda Quadrada - Livre
        // Sala 02 - A volta dos Que Não Foram - 12 anos
        // Sala 03 - Poeira em Alto Mar - 14 anos
        // Sala 04 - As tranças do Rei Careca - 16 anos
        // Sala 05 - A vingança do Peixe Frito - 18 anos 
        // O usuário deverá escolher o filme desejado. Se tiver idade
        // minima para ver o filme, o programa imprime o ingresso e encerra. 
        // Se o usuário não tiver a idade mínima, o programa bloqueia a entrada
        // e re-exibe a lista de filmes para o usuário
        // escolher outro filme.
        // **********************************************

        Scanner sc = new Scanner(System.in);

        String nome;
        String sala;
        String filme =null;
        int idade;
        int idadeMin = 0;
        

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();

        sc.nextLine();

        do {
            System.out.println("Olá, " + nome + " escolha o seu filme: ");
            System.out.println("Sala 01 - A Roda Quadrada - Livre");
            System.out.println("Sala 02 - A volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 03 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 04 -  As tranças do Rei Careca - 16 anos");
            System.out.println("Sala 05 - A vingança do Peixe Frito - 18 anos");
            System.out.println("**** Escolha um Filme ****");
            
            sala = sc.nextLine();
                       
            switch (sala) {
                case "1":
                  filme = "A Roda Quadrada";
                  idadeMin = 12;
                  break;
                case "2":
                  filme = "A volta dos Que Não Foram";
                  idadeMin = 14;
                  break;
                case "3":
                  filme = "Poeira em Alto Mar";
                  idadeMin = 16;
                    break;
                case "4":
                    filme = "As tranças do Rei Careca";
                    idadeMin = 18;
                    break;
                case "5": 
                    filme = "A vingança do Peixe Frito";
                break;
                case "6":
                    break;
                default:
                    idadeMin = idade + 1;
                    break;
            }

            if(idade >= idadeMin) {
              System.out.println("Ingresso comprado por " + nome);
              System.out.println("Filme: " + filme);
              System.out.println("Tenha um ótimo filme!!!");
            } else {
              System.out.println("Entrada não liberada para " + nome);
              System.out.println("Favor escolher outro filme!");
            }
        } while (idade >= idadeMin);
        
        sc.close();

    }
}
