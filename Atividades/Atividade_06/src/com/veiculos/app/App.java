package com.veiculos.app;

import java.util.Scanner;
import com.veiculos.models.Carro;
import com.veiculos.models.Caminhao;
import com.veiculos.models.Moto;
import com.veiculos.models.Onibus;

public class App {
    
    public static void main(String[] args) throws Exception {
        // TODO: ATIVIDADE 06
        // A Partir da superclasse abstrata veiculo, crie as subclasses finais:
        // Moto, Carro, onibus e caminhão, todas no package models. Instancie cada
        // uma das subclasses na classe principal, e peça para o usuário informar
        // os seguintes atributos privados de um veiculo escolhido pelo próprio usuário
        // Usuário: fabricante, modelo, cor, ano, placa. O atributo privado
        // categoria deverá ser informado pelo próprio usuário programa.
        // Diferenças entre as classes: carro terá bagageiro, onibus poderá ser leito ou não
        // e caminho terá carroceiria.
        // Ao final, o programa exibirá os dados do veículo, escolhido por ele.
        // NOTE: Utilize herança, abstração e encapsulamento para codar.

        Scanner sc = new Scanner(System.in);

        String tipoVeiculo;

        System.out.println("\n Digite uma das opcões abaixo: \n");
        System.out.println("A - Moto.");
        System.out.println("B - Carro.");
        System.out.println("C - Caminhão.");
        System.out.println("D - Ônibus.");
        tipoVeiculo = sc.nextLine();
        
    

        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, null, null, "A", null);
                // Entrada da de dados
                System.out.println("Informe o ano de fabricação: ");
                moto.setAnoFabricacao(sc.nextLine());
                System.out.println("Informe o fabricante: ");
                moto.setFabricante(sc.nextLine());
                System.out.println("Informe o Modelo: ");
                moto.setModelo(sc.nextLine());
                System.out.println("Infome a Placa: ");
                moto.setPlaca(sc.nextLine());
                System.out.println("Informo a cor: ");
                moto.setCor(sc.nextLine());
                System.out.println("Informe a Cilindrada: ");
                moto.setCilidrada(sc.nextLine());
                
                // Saída de dados
                System.out.println("\nDados da Moto.\n");
                System.out.println("Ano fabricação: " + moto.getAnoFabricacao());     
                System.out.println("Fabricante: " + moto.getFabricante());     
                System.out.println("Modelo: " + moto.getModelo());     
                System.out.println("Placa: " + moto.getPlaca());     
                System.out.println("Cor: " + moto.getCor());     
                System.out.println("Cilindrada: " + moto.getCilidrada());
                System.out.println("Categoria: " + moto.getCategoria());     
                break;
            case "B": 
                Carro car = new Carro(null,null ,null, null, null,"B", false);  
                
                System.out.println("Informe o ano de fabricação: ");
                car.setAnoFabricacao(sc.nextLine());
                System.out.println("Informe o fabricante: ");
                car.setFabricante(sc.nextLine());
                System.out.println("Informe o Modelo: ");
                car.setModelo(sc.nextLine());
                System.out.println("Infome a Placa: ");
                car.setPlaca(sc.nextLine());
                System.out.println("Informo a cor: ");
                car.setCor(sc.nextLine());
                System.out.println("Tem bagageiro ?: (SIM/ NÃO)");
                String resposta = sc.nextLine();
                boolean bagageiro = resposta.trim().equalsIgnoreCase("SIM");
                car.setBagageiro(bagageiro);


                System.out.println("\nDados do Veiculo.\n");
                System.out.println("Ano fabricação: " + car.getAnoFabricacao());     
                System.out.println("Fabricante: " + car.getFabricante());     
                System.out.println("Modelo: " + car.getModelo());     
                System.out.println("Placa: " + car.getPlaca());     
                System.out.println("Cor: " + car.getCor());     
                System.out.println("Bagageiro: " +  (car.getBagageiro() ? "SIM" : "NÃO"));
                System.out.println("Categoria: " + car.getCategoria());
                break;
            case "C":
                Caminhao caminhao = new Caminhao(null, null, null, null, null, "C", 0);
                System.out.println("Informe o ano de fabricação: ");
                caminhao.setAnoFabricacao(sc.nextLine());
                System.out.println("Informe o fabricante: ");
                caminhao.setFabricante(sc.nextLine());
                System.out.println("Informe o Modelo: ");
                caminhao.setModelo(sc.nextLine());
                System.out.println("Infome a Placa: ");
                caminhao.setPlaca(sc.nextLine());
                System.out.println("Informo a cor: ");
                caminhao.setCor(sc.nextLine());
                System.out.println("Informe a carroceira: ");
                caminhao.setCarroceira(sc.nextInt());

                System.out.println("\nDados do Caminhão.\n");
                System.out.println("Ano fabricação: " + caminhao.getAnoFabricacao());     
                System.out.println("Fabricante: " + caminhao.getFabricante());     
                System.out.println("Modelo: " + caminhao.getModelo());     
                System.out.println("Placa: " + caminhao.getPlaca());     
                System.out.println("Cor: " + caminhao.getCor());     
                System.out.println("Cilindrada: " + caminhao.getCarroceira());
                System.out.println("Categoria: " + caminhao.getCategoria());

            case "D":
                Onibus bus = new Onibus(null, null, null, null, null, "D", false);

                System.out.println("Informe o ano de fabricação: ");
                bus.setAnoFabricacao(sc.nextLine());
                System.out.println("Informe o fabricante: ");
                bus.setFabricante(sc.nextLine());
                System.out.println("Informe o Modelo: ");
                bus.setModelo(sc.nextLine());
                System.out.println("Infome a Placa: ");
                bus.setPlaca(sc.nextLine());
                System.out.println("Informo a cor: ");
                bus.setCor(sc.nextLine());
                System.out.println("Informe a carroceira: ");
                System.out.println("Tem leito ?: (SIM/ NÃO)");
                resposta = sc.nextLine();
                boolean leito = resposta.equalsIgnoreCase("SIM");
                bus.setLeito(leito);


                System.out.println("\nDados do Onibus.\n");
                System.out.println("Ano fabricação: " + bus.getAnoFabricacao());     
                System.out.println("Fabricante: " + bus.getFabricante());     
                System.out.println("Modelo: " + bus.getModelo());     
                System.out.println("Placa: " + bus.getPlaca());     
                System.out.println("Cor: " + bus.getCor());     
                System.out.println("leito: " + (bus.getLeito() ? "SIM":"NÃO"));
                System.out.println("Categoria: " + bus.getCategoria());
                  

            default:
                break;
        }











        sc.close();

    }
}
