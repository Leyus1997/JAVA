package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono t1) {
		if(t1.getOperadora()!=null) {
			t1.setTieneWhatsapp(true);
		}
		
	}
	
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
	    int contar = 0;
	    if ("movi".equals(t1.getOperadora())) {
	        contar++;
	    }
	    if ("movi".equals(t2.getOperadora())) {
	        contar++;
	    } 
	    if ("movi".equals(t3.getOperadora())) {
	        contar++;
	    }
	    return contar;
	}
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contar = 0;
		if ("claro".equals(t1.getOperadora())) {
			contar++;
		}
		if ("claro".equals(t2.getOperadora())) {
			contar++;
		} 
		if ("claro".equals(t3.getOperadora())) {
			contar++;
		}
		if ("claro".equals(t4.getOperadora())) {
			contar++;
		}
		return contar;
	}
	
	
	
	
}
