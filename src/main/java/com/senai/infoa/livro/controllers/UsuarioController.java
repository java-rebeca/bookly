package com.senai.infoa.livro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.livro.models.Usuario;
import com.senai.infoa.livro.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email,senha);
    }

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String confSenha) {
        return usuarioService.salvar(usuario, confSenha);
    }

    @GetMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(usuario, id);
    }
}
