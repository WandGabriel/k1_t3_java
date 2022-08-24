package com.todolist.tarefa;

import java.util.Date;

public class Tarefa{
    private String nome;
    private String descricao;
    private String dataTermino;
    private Integer prioridade;
    private String categoria;
    private String status;

    public Tarefa(){
    }
    public Tarefa(String nome, String descricao, String dataTermino, Integer prioridade, String categoria, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTermino='" + dataTermino + '\'' +
                ", prioridade=" + prioridade +
                ", categoria='" + categoria + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
