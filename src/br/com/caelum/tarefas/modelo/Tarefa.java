package br.com.caelum.tarefas.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.util.Calendar;

public class Tarefa {
    private Long id;

    @Size(min=5, message = "Tarefa deve possui conteúdo")
    private String descricao;

    private boolean finalizado;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Calendar dataFinalizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
}
