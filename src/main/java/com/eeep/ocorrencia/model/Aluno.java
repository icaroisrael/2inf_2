package com.eeep.ocorrencia.model;

public class Aluno {

    private Integer numero;
    private String nome;
    private String sexo;
    private String turma;
    private String matricula;

    public Aluno() {
    }

    public Aluno(Integer numero, String nome, String sexo, String turma, String matricula) {
        this.numero = numero;
        this.nome = nome;
        this.sexo = sexo;
        this.turma = turma;
        this.matricula = matricula;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}