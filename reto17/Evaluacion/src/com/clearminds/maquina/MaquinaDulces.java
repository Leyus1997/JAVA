package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;
	
	public void configurarMaquina(String codigo1,String codigo2,String codigo3,String codigo4) {
		Celda1 = new Celda(codigo1);
	    Celda2 = new Celda(codigo2);
	    Celda3 = new Celda(codigo3);
	    Celda4 = new Celda(codigo4);
		
	}
	
	public void mostrarConfiguracion() {
		System.out.println(Celda1.getCodigo());
		System.out.println(Celda2.getCodigo());
		System.out.println(Celda3.getCodigo());
		System.out.println(Celda4.getCodigo());
	}
	public Celda buscarCelda(String codigoCelda) {
		if(Celda1.getCodigo()==codigoCelda) {
			return Celda1;
		}else if(Celda2.getCodigo()==codigoCelda) {
			return Celda2;
		}else if(Celda3.getCodigo()==codigoCelda) {
			return Celda3;
		}else if(Celda4.getCodigo()==codigoCelda) {
			return Celda4;
		}else {return null;}
	}
	
	public void  cargarProducto(Producto p1,String codigoCelda, int Items ) {
		Celda celdaRecuperada;
		celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, Items);
	}
	public void  mostrarProductos() {
		System.out.println(Celda1.getCodigo());
		System.out.println(Celda1.getStock());
		System.out.println(Celda1.getProducto().getNombre());
		System.out.println(Celda1.getProducto().getPrecio());
		
		System.out.println(Celda2.getCodigo());
		System.out.println(Celda2.getStock());
		System.out.println(Celda2.getProducto().getNombre());
		System.out.println(Celda2.getProducto().getPrecio());
		
		System.out.println(Celda3.getCodigo());
		System.out.println(Celda3.getStock());
		System.out.println(Celda3.getProducto().getNombre());
		System.out.println(Celda3.getProducto().getPrecio());
		
		System.out.println(Celda4.getCodigo());
		System.out.println(Celda4.getStock());
		System.out.println(Celda4.getProducto().getNombre());
		System.out.println(Celda4.getProducto().getPrecio());
	}
	public Producto buscarProductoEnCelda (String codigoCelda) {
		if(Celda1.getCodigo()==codigoCelda) {
			return Celda1.getProducto();
		}else if(Celda2.getCodigo()==codigoCelda) {
			return Celda2.getProducto();
		}else if(Celda3.getCodigo()==codigoCelda) {
			return Celda3.getProducto();
		}else if(Celda4.getCodigo()==codigoCelda) {
			return Celda4.getProducto();
		}else {return null;}
	}
	public double consultarPrecio(String codigoCelda) {
		if(Celda1.getCodigo()==codigoCelda) {
			return Celda1.getProducto().getPrecio();
		}else if(Celda2.getCodigo()==codigoCelda) {
			return Celda2.getProducto().getPrecio();
		}else if(Celda3.getCodigo()==codigoCelda) {
			return Celda3.getProducto().getPrecio();
		}else if(Celda4.getCodigo()==codigoCelda) {
			return Celda4.getProducto().getPrecio();
		}else {return 0.0;}
	
		}
	public  Celda buscarCeldaProducto(String codigoCelda) {
		if(Celda1.getCodigo()==codigoCelda) {
			return Celda1;
		}else if(Celda2.getCodigo()==codigoCelda) {
			return Celda2;
		}else if(Celda3.getCodigo()==codigoCelda) {
			return Celda3;
		}else if(Celda4.getCodigo()==codigoCelda) {
			return Celda4;
		}else {return null;}
	}
	public void incrementarProductos(String codigoCelda,int Items) {
		Celda celdaEncontrada;
		celdaEncontrada=buscarCeldaProducto(codigoCelda);
		celdaEncontrada.setStock(Items);
	}
	public void vender(String codigoCelda) {
		if(Celda1.getCodigo()==codigoCelda) {
			Celda1.setStock(Celda1.getStock() - 1);
		}else if(Celda2.getCodigo()==codigoCelda) {
			Celda2.setStock(Celda2.getStock() - 1);
		}else if(Celda3.getCodigo()==codigoCelda) {
			 Celda3.setStock(Celda3.getStock() - 1);
		}else if(Celda4.getCodigo()==codigoCelda) {
			   Celda4.setStock(Celda4.getStock() - 1);
		}
	}
	public double venderConCambio(String codigoCelda,double pago) {
		Celda c1;
		c1=buscarCelda(codigoCelda);
		
		c1.setStock(c1.getStock()-1);
		double precioProducto;
		precioProducto=c1.getProducto().getPrecio();
		double vuelto;
		vuelto=pago-precioProducto;
		return vuelto;
	}
}
