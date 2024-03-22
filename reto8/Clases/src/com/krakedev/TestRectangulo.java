package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		int areaR1;
		int areaR2;
		r1.base=4;
		r1.altura=2;
		r2.base=8;
		r2.altura=5;
		areaR1=r1.CalcularArea();
		areaR2=r2.CalcularArea();
		
		System.out.println("Area r1: "+areaR1);
		System.out.println("Area r2: "+areaR2);
		
		//Cálculo perímetro
		
		double p11;
		p11=r1.CalcularPerimetro();
		System.out.println("Perímetro: "+p11);
	}

}
