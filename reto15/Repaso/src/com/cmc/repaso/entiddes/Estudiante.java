package com.cmc.repaso.entiddes;

public class Estudiante {
	
	public String nombre;
	public double nota;
	public String resultado;
	
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
		this.nota=nota;
	}
	public String Calificar(double nota){
	if(nota<8) {
		return "F";
	}else {
		return "A";
	}
	}
	
	
	
}
