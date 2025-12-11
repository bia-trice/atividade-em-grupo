package atividade.grupo.projeto_em_grupo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import atividade.grupo.projeto_em_grupo.models.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value="select * from usuario where email = :email", nativeQuery = true)
    public Usuario findByEmail(String email);
}
