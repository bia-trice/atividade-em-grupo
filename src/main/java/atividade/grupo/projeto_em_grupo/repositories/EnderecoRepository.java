package atividade.grupo.projeto_em_grupo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade.grupo.projeto_em_grupo.models.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}