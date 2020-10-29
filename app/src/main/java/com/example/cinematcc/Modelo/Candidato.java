package com.example.cinematcc.Modelo;

public class Candidato {

    private Long idCandidato;
    private String especialidadeCandi;

    @Override
    public String toString() {
        return especialidadeCandi + "Salvo";
    }

    public Long getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Long idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getEspecialidadeCandi() {
        return especialidadeCandi;
    }

    public void setEspecialidadeCandi(String especialidadeCandi) {
        this.especialidadeCandi = especialidadeCandi;
    }
}
