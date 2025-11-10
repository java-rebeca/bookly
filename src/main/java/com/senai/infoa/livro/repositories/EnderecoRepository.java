package com.senai.infoa.livro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.livro.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}