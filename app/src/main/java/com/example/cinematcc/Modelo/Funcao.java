package com.example.cinematcc.Modelo;

public class Funcao {

    private Long idFuncao;
    private String tipoFuncao;

    @Override
    public String toString() {
        return tipoFuncao +"Salvo";
    }

    public Long getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Long idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getTipoFuncao() {
        return tipoFuncao;
    }

    public void setTipoFuncao(String tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }
}
