package br.com.cotta.entrega.api.assembler;

import br.com.cotta.entrega.api.model.ClienteModel;
import br.com.cotta.entrega.domain.model.Cliente;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ClienteAssembler {
    private ModelMapper modelMapper;

    public ClienteModel toModel(Cliente cliente){
        return modelMapper.map(cliente, ClienteModel.class);
    }

    public List<ClienteModel> toCollectionModel(List<Cliente> clientes){
       return clientes.stream()
               .map(this::toModel)
               .collect(Collectors.toList());
    }

    public Cliente toEntity(ClienteModel cliente){
        return modelMapper.map(cliente, Cliente.class);
    }
}
