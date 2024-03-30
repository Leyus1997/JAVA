package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int Stock;
	private String codigo;
	
	
	public Celda(String codigo) {
		
		this.codigo = codigo;
	}

	public void ingresarProducto(Producto producto,int Stock) {
		this.producto = producto;
		this.Stock = Stock;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		this.Stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
