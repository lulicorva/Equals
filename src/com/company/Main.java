package com.company;

public class Main {

    public static void main(String[] args) {

        Persona personaA = new Persona("Maria",38852);
        Persona personaB = new Persona("Lorena", 38852);


        System.out.println((personaA.equals(personaB)));

        Coca coca1 = new Coca(4,1.20);
        Coca coca2 = new Coca(4,2.20);

        System.out.println(coca1.equals(coca2));
        //Me da true porque lo estoy comparando por tamaño en la CLASE COCA con el equals


    }


}
