package com.encapsulamento.models;

abstract public class Pessoa {
    // Atriburos
    private String email;
    private String telefone;

    // Constructor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos de acesso (getters e setters)
    public String getEmail() {
        return this.email;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    // todo método setter sempre será void
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
