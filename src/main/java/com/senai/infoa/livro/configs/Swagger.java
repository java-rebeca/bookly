package com.senai.infoa.livro.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Livros",
        version = "1.0",
        description = "Grupo: Isabela Santos, Maria Clara Fonseca, Maria Eduarda Tamancoldi, Rebeca Mendes."
    )
)
public class Swagger {

}