package com.example.cinematcc.Modelo;

public class Gestor {

    private Long idGestor;
    private String descGestor;

    @Override
    public String toString() {
        return descGestor + "Salvo";
    }

    public Long getIdGestor() {
        return idGestor;
    }

    public void setIdGestor(Long idGestor) {
        this.idGestor = idGestor;
    }

    public String getDescGestor() {
        return descGestor;
    }

    public void setDescGestor(String descGestor) {
        this.descGestor = descGestor;
    }
}
