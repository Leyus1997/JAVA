package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono t1) {
		if(t1.getOperadora()!=null) {
			t1.setTieneWhatsapp(true);
		}
		
	}
}
