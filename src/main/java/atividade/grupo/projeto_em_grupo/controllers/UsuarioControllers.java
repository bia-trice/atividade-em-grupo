package atividade.grupo.projeto_em_grupo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import atividade.grupo.projeto_em_grupo.models.Usuario;
import atividade.grupo.projeto_em_grupo.services.UsuarioServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UsuarioControllers {
    
    @Autowired
    public UsuarioServices usuarioService;

    @GetMapping("/count")
    public Long count() {
        return usuarioService.count();
        
    }

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

     @DeleteMapping("/delete/{id}")
     public String deletar(@PathVariable Integer id) {
        boolean deletou = usuarioService.delete(id);
         if(deletou) {
            return "Usuario removido com sucesso";
         }
         return "Falha ao remover o usuário";

     }
    }