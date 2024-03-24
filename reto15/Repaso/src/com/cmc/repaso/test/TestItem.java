package com.cmc.repaso.test;

import com.cmc.repaso.entiddes.Item;

public class TestItem {

	private static int devueltos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1=new Item();
		i1.Actuales=20;
		i1.imprimir();
		i1.vender(1);;
		i1.imprimir();
		i1.devolver(1);
		i1.imprimir();
		
	}

}
