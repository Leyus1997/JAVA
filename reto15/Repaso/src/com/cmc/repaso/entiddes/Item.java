package com.cmc.repaso.entiddes;

public class Item {
	public String nombre;
	public int Actuales;
	public int Devueltos;
	public int Vendidos;
	
	public void imprimir() {
		System.out.println("Actuales :"+Actuales);
		System.out.println("Devueltos :"+Devueltos);
		System.out.println("Vendidos :"+Vendidos);
	}
	public void vender(int Vendidos) {
		this.Vendidos=Vendidos;
		this.Actuales=Actuales-1;
	}
	public void devolver(int Devueltos) {
		this.Actuales=Actuales+1;
		this.Vendidos=Vendidos-1;
		this.Devueltos=Devueltos;
	}
	
	
	
}
