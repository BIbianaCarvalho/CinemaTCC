package com.example.cinematcc.Modelo;

public class Projeto {

    private Long idProj;
    private String nomeProj;
    private String descricao;

    @Override
    public String toString() {
        return nomeProj + " salvo";
    }

    public Long getIdProj() {
        return idProj;
    }

    public void setIdProj(Long idProj) {
        this.idProj = idProj;
    }

    public String getNomeProj() {
        return nomeProj;
    }

    public void setNomeProj(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
