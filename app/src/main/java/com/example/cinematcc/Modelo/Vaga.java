package com.example.cinematcc.Modelo;

public class Vaga {

    private Long idVaga;
    private String descriVagas;
    private int numVagas;

    @Override
    public String toString() {
        return descriVagas + " salvo";
    }

    public Long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Long idVaga) {
        this.idVaga = idVaga;
    }

    public String getDescriVagas() {
        return descriVagas;
    }

    public void setDescriVagas(String descriVagas) {
        this.descriVagas = descriVagas;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }
}
