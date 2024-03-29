package com.clearminds.componentes;

public class Producto {
	private String Nombre;
	private double precio;
	private String codigo;
	
	public Producto(String nombre, double precio, String codigo) {
		super();
		Nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public Producto(String codigo, String Nombre, double precio ) {
		
		this.Nombre = Nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public void incrementarPrecio(double porcentaje) {
		double resultadoPorcentaje;
		
		resultadoPorcentaje=precio*(porcentaje/100);
		this.precio=precio+resultadoPorcentaje;
		
	}
	public void disminuirPrecio(double descuento) {
		
		precio=precio-(descuento);
		
	}
	

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
