package com.eeep.ocorrencia.model;

public class Aluno {

    private Integer numero;
    private String nome;
    private String turma;

    public Aluno() {
    }

    public Aluno(Integer numero, String nome, String turma) {
        this.numero = numero;
        this.nome = nome;
        this.turma = turma;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
