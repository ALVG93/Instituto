package com.mycompany.instituto;

public class Profesor extends Persona{
    private String codigoDocente;

    public Profesor() {
        super();
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
}
