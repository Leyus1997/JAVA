package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1=new Telefono("movi", "0985353567", 21);
		Telefono t2=new Telefono("claro","091378617", 22);
		Telefono t3=new Telefono("movi", "093453596", 23);
		Telefono t4=new Telefono("claro", "099082545", 24);
		AdminTelefono cm=new AdminTelefono();
		int resultado;
		resultado=cm.contarClaro(t1, t2, t3,t4);
		System.out.println(resultado);
	}

}
