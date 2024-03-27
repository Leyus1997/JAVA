package com.cmc.directorio.test;

 

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1=new Telefono("movi", "0985353567", 21);
		Telefono t2=new Telefono("claro","091378617", 22);
		Telefono t3=new Telefono("movi", "093453596", 23);
		AdminTelefono cm=new AdminTelefono();
		int resultado;
		resultado=cm.contarMovi(t1, t2, t3);
		System.out.println(resultado);
		
	}

}
