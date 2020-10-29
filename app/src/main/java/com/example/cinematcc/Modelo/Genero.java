package com.example.cinematcc.Modelo;

public class Genero {

    private Long idGenero;
    private String tipoGenero;

    @Override
    public String toString() {
        return tipoGenero + " salvo";
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
}
