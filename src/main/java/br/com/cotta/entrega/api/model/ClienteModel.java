package br.com.cotta.entrega.api.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteModel {
    private Long id;

    @NotBlank
    @Size(max=45)
    private String nome;

    @NotBlank
    @Email
    private String email;

    @Size(max=15)
    private String telefone;
}
