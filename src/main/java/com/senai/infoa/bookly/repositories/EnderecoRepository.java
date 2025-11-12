package com.senai.infoa.bookly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.bookly.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}