package com.eeep.ocorrencia.model;

public class Ocorrencia {
    private String Aluno;
    private String Professor;
    private String Disciplina;
    private String Motivo;
    private Integer Data;
    private String Lugar;

    public Ocorrencia(String aluno, String professor, String disciplina, String motivo, Integer data, String lugar) {
        this.Aluno = aluno;
        this.Professor = professor;
        this.Disciplina = disciplina;
        this.Motivo = motivo;
        this.Data = data;
        this.Lugar = lugar;
    }

    public String getProfessor() {
        return Professor;
    }

    public void setProfessor(String professor) {
        Professor = professor;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String aluno) {
        Aluno = aluno;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public Integer getData() {
        return Data;
    }

    public void setData(Integer data) {
        Data = data;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

}
