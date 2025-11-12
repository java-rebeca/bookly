package com.senai.infoa.bookly.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Endereco")
public class Endereco {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="cep")
    private String cep;

    @Column(name="numero")
    private String numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="referencia")
    private String referencia;

    public Endereco() {}

    public Endereco(String logradouro, String localidade, String cep, 
    String numero, String complemento, String bairro, String referencia) {
        this.logradouro = logradouro;
        this.localidade = localidade;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getReferencia() {
        return referencia;
    }

}
