package atividade.grupo.projeto_em_grupo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atividade.grupo.projeto_em_grupo.models.Endereco;
import atividade.grupo.projeto_em_grupo.services.EnderecoService;



@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    public EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.salvar(endereco);

    }

     @GetMapping ("/buscar/{id}")
    public Endereco buscar(@PathVariable Integer id){
        return enderecoService.buscar(id);
    }


}