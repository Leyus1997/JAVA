package com.cmc.repaso.entiddes;

public class Producto {
	public String nombre;
	public double precio;
	
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public double getPrecio() {
		return precio;
	}

	public double setPrecio(double precio) {
		double resultado = 0;
		if(precio>0) {
			this.precio = precio;
		}else {
			resultado=(int) (precio*-1);
			return resultado;
		}
		return resultado;		
	}
		public double calcularPrecioPromo (double descuento) {
		double resultado;
		double PrescioDescontado;
		resultado=precio*(descuento/100);
		PrescioDescontado=precio-resultado;
		return PrescioDescontado;
	}
	
	
	
	
}
