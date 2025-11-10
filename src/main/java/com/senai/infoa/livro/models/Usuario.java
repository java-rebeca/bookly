package com.senai.infoa.livro.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="cpf")
    private String cpf;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    public Usuario() {}

    public Usuario(String nomeCompleto, String email, String cpf ,LocalDate dataNascimento, String senha){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }

    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }
  
}
