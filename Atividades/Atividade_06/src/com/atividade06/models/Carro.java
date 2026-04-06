package com.atividade06.models;

public final class Carro extends Veiculo {
    private String capacidadeBagageiro;

    public Carro(String fab, String mod, String cor, String ano, String pla, String bagageiro) {
        super(fab, mod, cor, ano, pla, "Veículo de Passeio");
        this.capacidadeBagageiro = bagageiro;
    }

    public String getCapacidadeBagageiro() { return capacidadeBagageiro; }
}