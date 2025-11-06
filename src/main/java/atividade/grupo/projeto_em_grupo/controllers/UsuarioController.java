package atividade.grupo.projeto_em_grupo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atividade.grupo.projeto_em_grupo.models.Usuario;
import atividade.grupo.projeto_em_grupo.services.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;


   @PostMapping("/cadastro")
public Usuario cadastro(@RequestBody Usuario usuario, 
                        @RequestParam String senha, 
                        @RequestParam String confSenha) {
    return usuarioService.cadastro(usuario, senha, confSenha);
}

    
    


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    
    }
    
}

