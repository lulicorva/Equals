package com.company;

import java.util.Objects;

public class Persona {

    String nombre;
    Integer dni;

    public Persona(String nombre, Integer dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }


    @Override
    public boolean equals(Object objetoAComparar) {
        if(objetoAComparar instanceof Persona){
            return((Persona)objetoAComparar).getDni().equals(this.getDni());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }
}
