package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1=new Producto(001, "Doritos");
		p1.setDescripcion("Doritos picantes");
		p1.setPeso(200);
		
		System.out.println("Prducto 1 :"+p1.getNombre());
		System.out.println("Codigo:"+p1.getCodigo());
		System.out.println("Descripcion :"+p1.getDescripcion());
		System.out.println("Peso :"+p1.getPeso()+" gr");
	}

}
