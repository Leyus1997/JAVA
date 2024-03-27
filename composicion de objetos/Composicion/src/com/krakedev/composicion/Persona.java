package com.krakedev.composicion;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;
	private Direccion direccion;     //crear un objeto de tipo dirección
	
	//funcion imprimir datos
	public void imprimir() {
		//condicional para cuando sea null
		if(direccion!=null) { //si es diferente de null 
		
		
		System.out.println("nombre :"+nombre+
							" apellido : "+apellido+
							//llamar clase direccion para ver sus atributos con get
	"direccion :"+direccion.getCallePrincipal()+" "+direccion.getCalleSecundaria()+" y "+direccion.getNumero()
							);
		}else {
		System.out.println("nombre : "+nombre+" apellido : "+"direccion es null");
		}
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
}