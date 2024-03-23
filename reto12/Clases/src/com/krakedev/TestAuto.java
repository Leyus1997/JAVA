package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Crear e instanciar
		Auto auto1 = new Auto("Definir Marca1", 0000, 0000.00);
		Auto auto2 = new Auto("Definir Marca2", 0000, 0000.00);
		
		//Modificar objetos
		auto1.setMarca("kia");
		auto1.setAnio(2008);
		auto1.setPrecio ( 10500);
		auto2.setMarca  ("chevrolet");
		auto2.setAnio  (2020);
		auto2.setPrecio  (20800);
		System.out.println("Auto 1");
		System.out.println("Marca :"+auto1.getMarca());
		System.out.println("Modelo :"+auto1.getAnio());
		System.out.println("Precio :"+auto1.getPrecio());
		System.out.println("Auto 2");
		System.out.println("Marca :"+auto2.getMarca());
		System.out.println("Modelo :"+auto2.getAnio());
		System.out.println("Precio :"+auto2.getPrecio());
	}

}
