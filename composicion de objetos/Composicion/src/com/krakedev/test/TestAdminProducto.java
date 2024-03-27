package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// Crear una variable tipo Producto
		Producto masCaro;
		AdminProducto admin=new AdminProducto();
		Producto productoA=new Producto("Doritos",0.50);
		Producto productoB=new Producto("Papas",0.50);
		
		//llamar a la funcion con al variable creada admin
		//ya que admin obtitne la funcion guardada en Admin Producto
		masCaro=admin.buscarMasCaro(productoA, productoB);
		//mostrar el resultado del producto mas caro
		
		//Un condicional para no tener errores
		if(masCaro==null) {
			System.out.println("Son iguales");
			
		}else {
			System.out.println("El mas caro es :"+masCaro.getNombre());
		}
		
		
		
	}

}
