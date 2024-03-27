package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primer forma de setear
		Telefono telef1=new Telefono("movi", "09459665",35);
		Contacto c1=new Contacto("Morales", telef1, 1.80);
		//segunda forma desetear
		Contacto c2=new Contacto("Moncayo", new Telefono("movi", "0968379461", 36), 1.80);
		
		//Instanciar AdminContactos 
		AdminContactos ad1=new AdminContactos();
		//crear variable de tipo contracto por que devuelve el mismo
		 Contacto masPessado1;
		 masPessado1=ad1.buscarMasPesado(c1,c2);
		 
		 if (masPessado1!=null) {
		 System.out.println("Apellido : "+masPessado1.getApellido());
		 System.out.println("Peso : "+masPessado1.getPeso());
		 System.out.println("Telefono  : "+masPessado1.getTelefono());
		 System.out.println("Estado : "+masPessado1.isActivo());
		 }else {System.out.println("Son iguales en peso");}
		 
		 //Instanciar AdminContactos 
		 AdminContactos ad2=new AdminContactos();
		 boolean operadora;
		 operadora=ad2.compararOperadora(c1, c2);
		 if(operadora) {
			 System.out.println(operadora);
			 System.out.println("las dos operadoras son iguales ");}
		 else {
			 System.out.println(operadora);
			 System.out.println("Las operadoras son diferentes");
		 }
	}

}
