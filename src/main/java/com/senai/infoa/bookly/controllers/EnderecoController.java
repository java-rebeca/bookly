package com.senai.infoa.bookly.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.bookly.models.Endereco;
import com.senai.infoa.bookly.services.EnderecoService;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep, @RequestParam(required=false) String numero, @RequestParam(required=false) String referencia) {
        return enderecoService.salvar(cep, numero, referencia);
    }

    @PutMapping("/atualizar/{id}")
    public Endereco atualizar(@PathVariable Integer id, @RequestBody Endereco endereco) {
        return enderecoService.atualizar(endereco, id);
    }

    @GetMapping("/buscarViaCep/{cep}")
    public Endereco buscar(@PathVariable String cep){
        return enderecoService.buscarViaCep(cep); 
    }

}