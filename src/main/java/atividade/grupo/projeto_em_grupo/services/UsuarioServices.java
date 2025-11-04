package atividade.grupo.projeto_em_grupo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atividade.grupo.projeto_em_grupo.models.Usuario;
import atividade.grupo.projeto_em_grupo.repositories.UsuarioRepositories;

@Service
public class UsuarioServices {
    @Autowired
    public UsuarioRepositories usuarioRepositories;

    public Long count() {
        return usuarioRepositories.count();
        
    }
    
    public Usuario salvar(Usuario usuario) {
        return usuarioRepositories.save(usuario);
    }

    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepositories.findById(id).get();
        if(usuario != null){
            usuarioRepositories.deleteById(id);
            return true;
         }
         return false;
    }
}