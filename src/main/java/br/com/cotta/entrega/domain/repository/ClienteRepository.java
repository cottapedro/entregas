package br.com.cotta.entrega.domain.repository;

import br.com.cotta.entrega.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
