package com.cmc.repaso.entiddes;

public class Validadacion {
	public boolean validarMonto(int monto) {
		if(monto>0) {
			
			System.out.println("Verdadero");
			return true;
		}else {
			
			System.out.println("Falso");
			return false;
		}
	}
}
