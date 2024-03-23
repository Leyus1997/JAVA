package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// crear e intanciar
		Producto productoA=new Producto("Registrar producto 1");
		Producto productoB=new Producto("Registrar producto 2");
		Producto productoC=new Producto("Registrar producto 3");
		
		//Modificar
		productoA.setNombre("Amoxicilina");
		productoA.setDescripcion ("Antibiótico utilizado para tratar infecciones bacterianas");
		productoA.setPrecio ( 0.35);
		productoA.setStockActual (100);
		productoB.setNombre ("Paracetamol");
		productoB.setDescripcion ("Analgésico y antipirético utilizado para aliviar el dolor y reducir la fiebre.");
		productoB.setPrecio ( 0.25);
		productoB.setStockActual (200);
		productoC.setNombre ("Ibuprofeno");
		productoC.setDescripcion ("Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación");
		productoC.setPrecio ( 0.55);
		productoC.setStockActual (150);
		//mostrar
		System.out.println("Nombre :"+productoA.getNombre());
		System.out.println("Descripción :"+productoA.getDescripcion());
		System.out.println("Precio :"+productoA.getPrecio());
		System.out.println("Stock :"+productoA.getStockActual());
		System.out.println("Nombre :"+productoB.getNombre());
		System.out.println("Descripción :"+productoB.getDescripcion());
		System.out.println("Precio :"+productoB.getPrecio());
		System.out.println("Stock :"+productoB.getStockActual());
		System.out.println("Nombre :"+productoC.getNombre());
		System.out.println("Descripción :"+productoC.getDescripcion());
		System.out.println("Precio :"+productoC.getPrecio());
		System.out.println("Stock :"+productoC.getStockActual());
		
		
		
		//Mostrar
	}

}
