package com.company;

import java.util.Objects;

public class Coca {

    Integer tamanio;
    Double precio;

    public Coca(Integer tamanio,Double precio){
        this.precio=precio;
        this.tamanio=tamanio;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object objetoAComparar) {
        if (objetoAComparar instanceof Coca){
            Coca unaCoca = (Coca) objetoAComparar;
            if (unaCoca.getTamanio().equals(this.tamanio)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanio, precio);
    }
}

