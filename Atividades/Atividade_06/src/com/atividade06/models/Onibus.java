package com.atividade06.models;

public final class Onibus extends Veiculo {
    private String tipoLeito; // "Sim" ou "Não"

    public Onibus(String fab, String mod, String cor, String ano, String pla, String tipoLeito) {
        super(fab, mod, cor, ano, pla, "Transporte de Passageiros");
        this.tipoLeito = tipoLeito;
    }

    public String getTipoLeito() { return tipoLeito; }
}