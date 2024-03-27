package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1=new Telefono("movi", "09941234123", 10);
		
		//Imprimir valores
		System.out.println(t1.getOperadora());
		System.out.println(t1.getNumero());
		System.out.println(t1.getCodigo());
		System.out.println(t1.isTieneWhatsapp());
	}

}
