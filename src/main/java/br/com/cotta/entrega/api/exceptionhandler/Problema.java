package br.com.cotta.entrega.api.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
public class Problema {
    private Integer status;
    private String titulo;
    private OffsetDateTime momento;
    List<Campos> campos;

    public Problema(Integer status, String titulo) {
        this.status = status;
        this.titulo = titulo;
        this.momento = OffsetDateTime.now();
    }

    @AllArgsConstructor
    @Getter
    public static class Campos{
        private String nome;
        private String mensagem;
    }


}
