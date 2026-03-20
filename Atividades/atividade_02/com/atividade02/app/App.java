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
        // String result;
        int idade;
        // int opcao;
        

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();

        if (idade >=12 && idade < 18) {
            System.out.println("Olá, " + nome + "filmes disponiveis para você: ");
            System.out.println("Sala 01 - A Roda Quadrada - Livre");
            System.out.println("Sala 02 - A volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 03 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 04 -  As tranças do Rei Careca - 16 anos");
        } 

        // do {
        //     System.out.println("**** Escolha um Filme ****");
          
        //     System.out.println("Sala 05 - A vingança do Peixe Frito - 18 anos");

        //     result = (idade < 18 && idade >= 12) ? "" : 
        //     (idade < 14) ? "Você pode assistir esse filme!" : 
        //     (idade < 16) ? ""
            
            
        // } while (condition);
        
        sc.close();



    }
}
