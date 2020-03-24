package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //PUNTO 1
        Persona personaA = new Persona("Maria",38852);
        Persona personaB = new Persona("Lorena", 38852);


        System.out.println((personaA.equals(personaB)));


        //PUNTO 2
        Coca coca1 = new Coca(4,1.20);
        Coca coca2 = new Coca(4,2.20);

        System.out.println(coca1.equals(coca2));
        //Me da true porque lo estoy comparando por tamaño en la CLASE COCA con el equals


        //PUNTO 3

        Alumno alumno1 = new Alumno("Mario",1);
        Alumno alumno2 = new Alumno("Carla",2);
        Alumno alumno3 = new Alumno("Juan",3);
        Alumno alumno4 = new Alumno("Frigerio",4);
        Alumno alumno5 = new Alumno("Kia",3);

        List<Alumno> listaDeAlumnos = new ArrayList<>();

        listaDeAlumnos.add(alumno1);
        listaDeAlumnos.add(alumno2);
        listaDeAlumnos.add(alumno3);
        listaDeAlumnos.add(alumno4);

        System.out.println(listaDeAlumnos.contains(alumno5));
        //Esto me da TRUE porque aunque no este el alumno en la lista, busca comparar por numeroDeAlumno


        //PUNTO 4 - EMPLEADOS

        Empleado empleado1 = new Empleado("Jorge",20);
        Empleado empleado2 = new Empleado("Miguel",21);
        Empleado empleado3 = new Empleado("Jacinto",22);
        Empleado empleado4 = new Empleado("Esteban",23);
        Empleado empleado5 = new Empleado("Fabio",21);

        List<Empleado> listaDeEmpleados = new ArrayList<>();

        listaDeEmpleados.add(empleado1);
        listaDeEmpleados.add(empleado2);
        listaDeEmpleados.add(empleado3);
        listaDeEmpleados.add(empleado4);

        System.out.println(listaDeEmpleados.contains(empleado5));

        //Aca sucede lo mismo, aunque el empleado5 no este agregado a la listaDeEmpleados, el EQUALS compara los numeros
        //de legajo, entonces al tener el mismo num que el empleado2, lo toma igual y devuelve true.
    }


}
