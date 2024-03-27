package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numero;
	private double latitud;
	private double longitud;
	//contructores
	public Direccion() {}
	
	
	public Direccion(String callePrincipal, String calleSecundaria, String numero) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	
	//Metodos de set y get
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
	
	
}
