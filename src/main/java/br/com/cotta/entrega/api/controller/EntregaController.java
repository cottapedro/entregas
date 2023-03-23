package br.com.cotta.entrega.api.controller;

import br.com.cotta.entrega.api.assembler.ClienteAssembler;
import br.com.cotta.entrega.api.assembler.EntregaAssembler;
import br.com.cotta.entrega.api.model.ClienteModel;
import br.com.cotta.entrega.api.model.EntregaModel;
import br.com.cotta.entrega.domain.model.Cliente;
import br.com.cotta.entrega.domain.model.Entrega;
import br.com.cotta.entrega.domain.repository.ClienteRepository;
import br.com.cotta.entrega.domain.repository.EntregaRepository;
import br.com.cotta.entrega.domain.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {

    private EntregaRepository entregaRepository;
    private EntregaAssembler entregaAssembler;

    @GetMapping
    public List<EntregaModel> listar(){
        List<Entrega> entregas =  entregaRepository.findAll();
        return entregaAssembler.toCollectionModel(entregas);
    }
}
