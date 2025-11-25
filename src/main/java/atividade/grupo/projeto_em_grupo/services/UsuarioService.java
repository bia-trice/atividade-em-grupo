package atividade.grupo.projeto_em_grupo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atividade.grupo.projeto_em_grupo.models.Usuario;
import atividade.grupo.projeto_em_grupo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public String login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";
        }
        return null;
    }

    public Usuario cadastro(Usuario usuario, String senha, String confSenha) {
        if (senha.equals(confSenha)) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public Long count() {
        return usuarioRepository.count();
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}


