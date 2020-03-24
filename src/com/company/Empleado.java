package com.company;

import java.util.Objects;

public class Empleado {

    String nombre;
    Integer numeroDeLegajo;

    public Empleado(String nombre, Integer numeroDeLegajo){
        this.nombre=nombre;
        this.numeroDeLegajo=numeroDeLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    @Override
    public boolean equals(Object objetoAComparar) {
        if (objetoAComparar instanceof Empleado){
            Empleado nuevoEmpleado = (Empleado) objetoAComparar;
            if(nuevoEmpleado.getNumeroDeLegajo().equals(this.numeroDeLegajo)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroDeLegajo);
    }
}
