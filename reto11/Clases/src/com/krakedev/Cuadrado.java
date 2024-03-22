package com.krakedev;

public class Cuadrado {
	public int lado;
	public double CalularAreaCuadrado() {
		double AreaCuadrado=lado*lado;
		return AreaCuadrado;
	}
	public double CalcularPerimetroCuadrado() {
		double PerimetroCuadrado=lado*4;
		return PerimetroCuadrado;
	}
}
