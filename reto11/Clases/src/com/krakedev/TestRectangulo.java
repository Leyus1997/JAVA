package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		
		
		int areaR1;
		
		r1.base=4;
		r1.altura=2;
		
		areaR1=r1.CalcularArea();
		
		
		System.out.println("Area r1: "+areaR1);
		
		
		//Cálculo perímetro
		double p1;
		p1=r1.CalcularPerimetro();
		System.out.println("Perímetro: "+p1);
		
		
	}
}
