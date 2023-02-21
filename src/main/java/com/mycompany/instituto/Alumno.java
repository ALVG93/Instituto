package com.mycompany.instituto;

public class Alumno extends Persona{
    private String codigoAlumno;

    public Alumno() {
        super();
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
}
