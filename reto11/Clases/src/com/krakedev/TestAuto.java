package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Crear e instanciar
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//Modificar objetos
		auto1.marca = "kia";
		auto1.anio = 2008;
		auto1.precio = 10500;
		auto2.marca = "chevrolet";
		auto2.anio = 2020;
		auto2.precio = 20800;
		System.out.println("Auto 1");
		System.out.println("Marca :"+auto1.marca);
		System.out.println("Modelo :"+auto1.anio);
		System.out.println("Precio :"+auto1.precio);
		System.out.println("Auto 2");
		System.out.println("Marca :"+auto2.marca);
		System.out.println("Modelo :"+auto2.anio);
		System.out.println("Precio :"+auto2.precio);
	}

}
