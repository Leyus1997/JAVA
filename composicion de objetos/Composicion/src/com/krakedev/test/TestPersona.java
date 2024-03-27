package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		//ingresar datos
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		
		//crear nueva variable para almacenar direccion
		Direccion dir=new Direccion(); //Se genera error
		//INgresar datos en la direccion
		dir.setCallePrincipal("Av. 6 de diciembre");
		dir.setCalleSecundaria("José Joaquín");
		dir.setNumero("S59-142");
		//dentro del atributo direccion se le pasa la direccion 
		//En p1 tenemos el atributo direccion
		p1.setDireccion(dir);//dir contiene datos de direccion*********
		
		//En 1 guardo el nombre de p1
		String nombre=p1.getNombre();
		//creo una variablellamada d1 de tipo direccion
		//Dentro de d1 guardo la direccion de p1***********************
		Direccion d1=p1.getDireccion();
	
		//Mostrar datos
		System.out.println("Nombre :"+nombre);
		//d1 está null, y trato de invocar a un método con esa variable
		System.out.println(d1.getCallePrincipal());
		
		//null.algunMetodo();
		
		//Llamar la funcion imprimir de la clase personas con la variable p1
		p1.imprimir();
		
		//******************************
		//crear y imprimir persona 2
		Persona p2=new Persona();
		p2.setNombre("Anastasia");
		
		//Crear y setear direccion
		Direccion d2=new Direccion("Av.Shyris", "Eloy Alfar","983453");
		p2.setDireccion(d2); //pasar los datos de la direccion
		//Mostara resultado
		p2.imprimir();
		
		//Otra forma de setear la direccion
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx", "yy", "123"));
		p3.imprimir();
	}

}
