package com.senai.infoa.livro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.livro.models.Endereco;
import com.senai.infoa.livro.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
