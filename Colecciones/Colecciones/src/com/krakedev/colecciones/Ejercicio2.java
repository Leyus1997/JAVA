package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
    //crear e intaciar arreglo persona
    ArrayList<Persona> personas;
    personas = new ArrayList<Persona>();
    
    personas.add(new Persona("Leon","Messi"));
    personas.add(new Persona("Chistiano","Ronaldo"));
    personas.add(new Persona("Thiago","Lopez"));
        //Imprimier datos con un for
    Persona elementoPersona;
        for (int i=0;i<personas.size();i++) {
            elementoPersona=personas.get(i);
            System.out.println(elementoPersona.getNombre()+" - "+elementoPersona.getApellido());
        }
    }
}
