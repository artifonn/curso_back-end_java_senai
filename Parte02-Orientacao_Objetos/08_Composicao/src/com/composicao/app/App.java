package com.composicao.app;

import java.util.Scanner;

import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pessoa motorista = new Pessoa(null, null, null, null, null);
        Veiculo carro = new Veiculo(null, null, null, null,null, null, motorista);

        System.out.println("Informe o nome do motorista: ");
        motorista.setNome(sc.nextLine());

        System.out.println("Informe o cpf do motorista: ");
        motorista.setCpf(sc.nextLine());

        System.out.println("Informe o telenfone do motorista: "); 
        motorista.setTelefone(sc.nextLine());

        System.out.println("Informe o e-mail do motorista: ");
        motorista.setEmail(sc.nextLine());

        System.out.println("Informe a CNH do motorista: ");
        motorista.setCnh(sc.nextLine());


        // Dados do veículo

        System.out.println("Informe o fabricante do carro: ");
        carro.setFabricante(sc.nextLine());

        System.out.println("Informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());

        System.out.println("Informe a cor do carro");
        carro.setCor(sc.nextLine());

        System.out.println("Informe o ano do carro: ");
        carro.setAno(sc.nextLine());

        System.out.println("Informe a placa do carro: ");
        carro.setPlaca(sc.nextLine());

        System.out.println("informe o RENAVAN:");
        carro.setRenavan(sc.nextLine());
        carro.setMotorista(motorista);

        System.out.println("\n\n======= DADOS =======");
        
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Modelo do carro:  " + carro.getModelo());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Ano do carro: " + carro.getAno());
        System.out.println("Placa do carro: " + carro.getPlaca());
        System.out.println("Renavan: " + carro.getRenavan());
        System.out.println("Nome do motorista do carro: " + carro.getMotorista().getNome());
        System.out.println("CPF do motorista: " + carro.getMotorista().getCpf());
        System.out.println("Telefone do Motorista: " + carro.getMotorista().getTelefone()); 
        System.out.println("Email do motorista: " + carro.getMotorista().getEmail());
        System.out.println("CNH do motorista: " + carro.getMotorista().getCnh());
      
        sc.close();

    }

}
