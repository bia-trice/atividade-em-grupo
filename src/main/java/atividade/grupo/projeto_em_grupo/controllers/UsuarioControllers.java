package atividade.grupo.projeto_em_grupo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import atividade.grupo.projeto_em_grupo.models.Usuario;
import atividade.grupo.projeto_em_grupo.services.UsuarioService;

@RestController
public class UsuarioControllers{

    @Autowired
    private UsuarioService usuarioService;

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
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }

    @PostMapping("/cadastro")
    public Usuario cadastro(
            @RequestBody Usuario usuario,
            @RequestParam String senha,
            @RequestParam String confSenha
    ) {
        return usuarioService.cadastro(usuario, senha, confSenha);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }

    @GetMapping("/usuarios")
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return usuarioService.buscarPorId(id);
    }
}

   
    