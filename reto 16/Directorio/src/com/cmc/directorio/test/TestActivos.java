package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c5=new Contacto("Guanotasig",new Telefono("movi", "0934682571", 37),1.60);
		System.out.println("Tiene Whasapp : "+c5.getTelefono().isTieneWhatsapp());
		System.out.println("Estado : "+c5.isActivo());
		System.out.println("********************************");
		
		//Instanciar AdminContactos
		AdminContactos ad5=new AdminContactos();
		ad5.activarUsuario(c5);
		System.out.println("Estado : "+c5.isActivo());
	}

}
