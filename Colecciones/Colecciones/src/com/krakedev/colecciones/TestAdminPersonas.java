package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti",50));
		admin.agregar(new Persona("Clark", "Kent",45));
		admin.agregar(new Persona("Bruno", "Diaz",12));
		admin.imprimir();
		
		//Imprimir si la persona existe
		Persona p1=admin.buscarPorNombre("Jose");
		
		if(p1!=null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre jose");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("mayores"+personasMayores.size());
		
		
		
		
		
	}

}
