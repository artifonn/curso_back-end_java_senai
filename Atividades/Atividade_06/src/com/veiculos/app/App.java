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
                // TODO: Informar dados da moto                
                break;
                // TODO: Fazer os cases dos outros veiculos;        
            default:
                break;
        }











        sc.close();

    }
}
