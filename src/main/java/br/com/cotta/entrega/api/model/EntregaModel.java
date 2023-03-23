package br.com.cotta.entrega.api.model;

import br.com.cotta.entrega.domain.model.Cliente;
import br.com.cotta.entrega.domain.model.Destinatario;
import br.com.cotta.entrega.domain.model.EntregaStatus;
import jakarta.persistence.Embedded;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class EntregaModel {
    private Long id;
    private BigDecimal taxa;
    private OffsetDateTime dataPedido;
    private OffsetDateTime dataFinalizacao;
    private Destinatario destinatario;
    private ClienteModel cliente;
    private EntregaStatus status;
}
