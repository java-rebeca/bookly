package com.senai.infoa.bookly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.infoa.bookly.models.Endereco;
import com.senai.infoa.bookly.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(String cep, String numero, String referencia) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setNumero(numero);
        endereco.setReferencia(referencia);
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
    }

        public Endereco atualizar(Endereco endereco, Integer id) { 
        Endereco e = enderecoRepository.findById(id).get();
        if (e != null) {
            endereco.setId(id); 
            return enderecoRepository.save(endereco); 
        }
        return null;
    }
}
