package br.com.cotta.entrega.domain.service;

import br.com.cotta.entrega.domain.model.Cliente;
import br.com.cotta.entrega.domain.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long clienteId){
        clienteRepository.deleteById(clienteId);
    }

}
