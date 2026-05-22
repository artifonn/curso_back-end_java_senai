package com.crud.javalanches.models;


// bibliotecas para criar um banco pelo java
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {

    // Atributos do banco

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoEndereco;
    @Column(nullable = true, length = 10)
    private String Cep;
    @Column(nullable = true)
    private String uf;
    @Column(nullable = true)
    private String cidade;
    @Column(nullable = true)
    private String bairro;
    @Column(nullable = true)
    private String logradouro;
    @Column(nullable = true)
    private String numero;
    @Column(length = 255)
    private String complemento;

    // Construtor vazio
    public Endereco() {
    }

    // Metodos getters e Setters
    public long getCodigoEndereco() {
        return this.codigoEndereco;
    }

    public void setCodigoEndereco(long codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public String getCep() {
        return this.Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    


}
