package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// crear e intanciar
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		//Modificar
		productoA.nombre ="Amoxicilina";
		productoA.descripcion ="Antibiótico utilizado para tratar infecciones bacterianas";
		productoA.precio = 0.35;
		productoA.stockActual =100;
		productoB.nombre ="Paracetamol";
		productoB.descripcion ="Analgésico y antipirético utilizado para aliviar el dolor y reducir la fiebre.";
		productoB.precio = 0.25;
		productoB.stockActual =200;
		productoC.nombre ="Ibuprofeno";
		productoC.descripcion ="Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación";
		productoC.precio = 0.55;
		productoC.stockActual =150;
		//mostrar
		System.out.println("Nombre :"+productoA.nombre);
		System.out.println("Descripción :"+productoA.descripcion);
		System.out.println("Precio :"+productoA.precio);
		System.out.println("Stock :"+productoA.stockActual);
		System.out.println("Nombre :"+productoB.nombre);
		System.out.println("Descripción :"+productoB.descripcion);
		System.out.println("Precio :"+productoB.precio);
		System.out.println("Stock :"+productoB.stockActual);
		System.out.println("Nombre :"+productoC.nombre);
		System.out.println("Descripción :"+productoC.descripcion);
		System.out.println("Precio :"+productoC.precio);
		System.out.println("Stock :"+productoC.stockActual);
		
		
		
		//Mostrar
	}

}
