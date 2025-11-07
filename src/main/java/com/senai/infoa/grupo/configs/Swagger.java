package com.senai.infoa.grupo.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Exemplo API",
        version = "1.0",
        description = "Alunas: Isabela Santos, Maria Clara Fonseca, Maria Eduarda Tamancoldi, Rebeca Mendes."
    )
)
public class Swagger {

}
