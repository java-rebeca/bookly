package com.senai.infoa.livro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.livro.models.Endereco;
import com.senai.infoa.livro.services.EnderecoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }
}
