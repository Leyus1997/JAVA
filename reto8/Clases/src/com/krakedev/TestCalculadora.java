package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora	calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(5,3);
		
		System.out.println("Rsultado: "+resultadoSuma);
		System.out.println("Rsultado: "+resultadoResta);
		
		double resultadoMultiplicacion;
		resultadoMultiplicacion=calcu.multiplicar(10,5);
		System.out.println("resultado multiplicacion: "+resultadoMultiplicacion);
		
		double resulDivi;
		resulDivi=calcu.dividir(10,2);
		System.out.println("Resultado division: "+resulDivi);
		
		double promediar;
		promediar=calcu.promediar(10, 8,9);
		System.out.println("Resultado promedio: "+promediar);
		
		calcu.mostrarResultado();
	}

}
