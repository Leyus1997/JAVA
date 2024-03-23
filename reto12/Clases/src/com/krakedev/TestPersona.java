package com.krakedev;
/* 
 * Muchos comentarios
 */
public class TestPersona {

	public static void main(String[] args) {
		//Declaro una variable de tipo persona llamada p
		Persona p;
		
		//3.Acceder a los atributos
		p=new Persona("Registrar nombre de persona"); //creando el objeto Persona y guardando
		System.out.println("nombre "+p.getNombre());
		System.out.println("edad "+p.getEdad());
		System.out.println("statura "+p.getEstatura());
		
		//Persona 2
		Persona p2=new Persona("Registrar nombre de persona");
		//Ingresar datos en p2
		p2.setNombre("Angelina");
		// Mostrar los objetos de p2
		System.out.println("*************");
		System.out.println("p.nombre :"+p.getNombre());
		System.out.println("p2.nombre :"+p2.getNombre());
		
		//4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("-------------------------");
		//5. Acceder a los atributos
		System.out.println("nombre :"+ p.getNombre());
		System.out.println("edad :"+ p.getEdad());
		System.out.println("estatura :"+ p.getEstatura());
	}

}
