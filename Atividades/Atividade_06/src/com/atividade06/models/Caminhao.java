package com.atividade06.models;

public final class Caminhao extends Veiculo {
    private String tipoCarroceria;

    public Caminhao(String fab, String mod, String cor, String ano, String pla, String carroceria) {
        super(fab, mod, cor, ano, pla, "Veículo de Carga");
        this.tipoCarroceria = carroceria;
    }

    public String getTipoCarroceria() { return tipoCarroceria; }
}