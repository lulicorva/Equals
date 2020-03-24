package com.company;

import java.util.Objects;

public class Alumno {

    String nombre;
    Integer numeroDeAlumno;


    public Alumno(String nombre, Integer numeroDeAlumno){
        this.nombre=nombre;
        this.numeroDeAlumno=numeroDeAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeAlumno(Integer numeroDeAlumno) {
        this.numeroDeAlumno = numeroDeAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroDeAlumno() {
        return numeroDeAlumno;
    }

    @Override
    public boolean equals(Object objetoAComparar) {
        if (objetoAComparar instanceof Alumno){
            Alumno unAlumno = (Alumno) objetoAComparar;
            if(unAlumno.getNumeroDeAlumno().equals(this.numeroDeAlumno)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroDeAlumno);
    }
}
