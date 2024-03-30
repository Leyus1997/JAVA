package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		//la línea 15 de TestBuscarProducto produce error por que esta en null
		//EN la maquina de dulces en la línea 80 esta el erro ya que 
		//A1 no tien registrados datos de producto
		//Se registro en los datos en B1 
		// Y la variable que esta null es nombre del producto A1
		
		
		
	}
}
