package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("B3"));
        
        maquina.cargarProducto(new Producto("001", "papas", 0.45), "A1", 4);
        maquina.cargarProducto(new Producto("002", "Bombones", 0.25), "A2", 5);
        maquina.cargarProducto(new Producto("003", "galletas", 0.50), "A3", 10);
        maquina.cargarProducto(new Producto("004", "chocolate Galack", 0.35), "B1", 40);
        maquina.cargarProducto(new Producto("005", "doritos", 0.50), "B2", 25);
        maquina.cargarProducto(new Producto("006", "Chetos", 0.45), "B3", 15);
        
        maquina.mostrarProductos();
        
        MaquinaDulces menores=new MaquinaDulces();
        ArrayList<Producto> preciosMenores = menores.buscarMenores(0.40);
        System.out.println("menores 0.40: "+preciosMenores.size());
		
		
		
	}

}
