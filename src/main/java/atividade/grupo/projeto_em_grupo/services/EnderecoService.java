package atividade.grupo.projeto_em_grupo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atividade.grupo.projeto_em_grupo.models.Endereco;
import atividade.grupo.projeto_em_grupo.repositories.EnderecoRepository;





@Service
public class EnderecoService {
    
    @Autowired
    public EnderecoRepository enderecoRepository;

     public Endereco salvar(Endereco endereco){
            return enderecoRepository.save(endereco);
        }
       
    public Endereco buscar(Integer id){
        return enderecoRepository.findById(id).get();
   }

   public List <Endereco> listarEndereco (){
    return enderecoRepository.findAll();
   }



}