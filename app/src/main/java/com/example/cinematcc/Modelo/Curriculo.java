package com.example.cinematcc.Modelo;

public class Curriculo {

    private Long idCurriculo;
    private String formacao;
    private String habilidade;
    private String experiencia;

    @Override
    public String toString() {
        return formacao + " salvo";
    }

    public Long getIdCurriculo() {
        return idCurriculo;
    }

    public void setIdCurriculo(Long idCurriculo) {
        this.idCurriculo = idCurriculo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
