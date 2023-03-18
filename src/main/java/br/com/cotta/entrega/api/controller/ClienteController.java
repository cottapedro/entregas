package br.com.cotta.entrega.api.controller;

import br.com.cotta.entrega.api.assembler.ClienteAssembler;
import br.com.cotta.entrega.api.model.ClienteModel;
import br.com.cotta.entrega.domain.model.Cliente;
import br.com.cotta.entrega.domain.repository.ClienteRepository;
import br.com.cotta.entrega.domain.service.ClienteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository clienteRepository;
    private ClienteAssembler clienteAssembler;

    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> listar(){
        List<Cliente> clientes =  clienteRepository.findAll();
        return clienteAssembler.toCollectionModel(clientes);
    }

    @PostMapping
    public ClienteModel salvar(@Valid @RequestBody ClienteModel clienteModel){
        Cliente cliente = clienteService.salvar(clienteAssembler.toEntity(clienteModel));
        return clienteAssembler.toModel(cliente);
    }
}
