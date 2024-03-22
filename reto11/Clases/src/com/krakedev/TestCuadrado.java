package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculo Area Cuadrado
		Cuadrado r1=new Cuadrado();
		double areaCuadrado;
		r1.lado=4;
		areaCuadrado=r1.CalularAreaCuadrado();
		System.out.println("Area cuadrado: "+areaCuadrado);
				
		//Cálcular perímetro
		Cuadrado r2=new Cuadrado();
		r2.lado=3;
		double perimetro;
		perimetro=r2.CalcularPerimetroCuadrado();
		System.out.println("Perimetro: "+perimetro);
	}
}
		