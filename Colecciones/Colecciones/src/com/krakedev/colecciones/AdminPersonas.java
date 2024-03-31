package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	//intanciar
    private ArrayList<Persona> personas;
    // para eviter errores aquí se agrega a la lista personas el arreglo
    public AdminPersonas () {
    	personas=new ArrayList<Persona>();
    }
            
    //Agregar personas
    public void agregar(Persona persona) {
    	personas.add(persona);    }
    public void imprimir() {
    	Persona elementoPersonas;
    	for (int i=0;i<personas.size() ;i++) {
    		elementoPersonas=personas.get(i);
    		System.out.println("Persona: "+elementoPersonas.getNombre()+" "+elementoPersonas.getEdad());
    	}
    }
    public Persona buscarPorNombre(String nombre) {
    	Persona personaEncontrada=null;
    	Persona elementoPersona = null;
    	for(int i=0;i<personas.size();i++) {
    		elementoPersona=personas.get(i);
    		if(nombre.equals(elementoPersona.getNombre())){
    			personaEncontrada=elementoPersona;
    		}
    	}
    		
    	return personaEncontrada;
    }
    public ArrayList<Persona> buscarMayores(int edad){
    	ArrayList<Persona> mayores=new ArrayList<Persona>();// crear valriable mayores de tipo lista
    	Persona elementoPersona=null; //crear variable elementoPersona de tipo Personas
    	for(int i=0;i<personas.size();i++) {
    		elementoPersona=personas.get(i);
    		if(elementoPersona.getEdad() > edad) {//si la edad es mayor que busca en el arreglo personas
    			mayores.add(elementoPersona);  //se guarda en la lista mayores los elementos encontrados en lista personas
    			
    		}
    	}
    	return mayores;
    }
}
