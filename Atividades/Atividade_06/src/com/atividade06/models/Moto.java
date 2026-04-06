package com.atividade06.models;

public final class Moto extends Veiculo {
    private String cilindradas;

    public Moto(String fab, String mod, String cor, String ano, String pla, String cilindradas) {
        super(fab, mod, cor, ano, pla, "Motocicleta");
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() { return cilindradas; }
}