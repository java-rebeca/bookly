package com.senai.infoa.bookly.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.bookly.models.Usuario;
import com.senai.infoa.bookly.services.UsuarioService;

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

    @PutMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(usuario, id);
    }

    @GetMapping("/listar")
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

}
