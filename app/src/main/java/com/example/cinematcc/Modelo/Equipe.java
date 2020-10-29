package com.example.cinematcc.Modelo;

public class Equipe {


    private Long idEquip;
    private String nomeEquip;


    @Override
    public String toString() {
        return nomeEquip + "Salvo";
    }

    public Long getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(Long idEquip) {
        this.idEquip = idEquip;
    }

    public String getNomeEquip() {
        return nomeEquip;
    }

    public void setNomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }

}
