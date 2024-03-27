package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imprimir datos 
		
		Telefono telef=new Telefono("movi", "09459665", 30);
		Contacto c=new Contacto("Daysi",telef,1.70);
		System.out.println(c.getApellido());
		System.out.println(telef.getNumero());
		System.out.println(telef.getOperadora());
		System.out.println(c.getPeso());
		
		
		
		
	}

}
