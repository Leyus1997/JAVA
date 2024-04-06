package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo=1.5499999999999998;

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
		
		
	}

	public void mostrarConfiguracion() {
		
		
		System.out.println("Celda 1 : " + celdas.get(0).getCodigo());
		System.out.println("Celda 2 : " + celdas.get(1).getCodigo());
		System.out.println("Celda 3 : " + celdas.get(2).getCodigo());
		System.out.println("Celda 4 : " + celdas.get(3).getCodigo());
		
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada=null;
		Celda elementoCodigo=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCodigo=celdas.get(i);
			if (codigoCelda.equals(elementoCodigo.getCodigo())) {
				return elementoCodigo;
			}
		}
		return celdaEncontrada;
		
		 
		
	}

	public void cargarProducto(Producto p1, String codigoCelda, int Items) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, Items);
	}

	public void mostrarProductos() {
		Celda a;
		for (int i=0;i<celdas.size();i++) {
			a=celdas.get(i);
				
			if (a != null && a.getProducto() != null && a.getProducto().getNombre() != null && a.getProducto().getCodigo() != null) {
				System.out.println("Celda:"+a.getCodigo()+" Stock: "+a.getStock()+" Producto "+a.getProducto().getCodigo()+" Precio "+a.getProducto().getPrecio());
				
			}else {
				System.out.println("Celda"+a.getCodigo()+" Stock: "+a.getStock()+" Sin producto asignado");
			}
		}
	}

	

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda base=null;
		Celda buscarProducto=null;
				
		//funcion buscar
		for (int i=0;i<celdas.size();i++) {
			base=celdas.get(i);
			if(codigoCelda.equals(base.getCodigo())) {
				buscarProducto=base;
			}
							
		}
		
		// validacion par que no de error
		if(buscarProducto!=null && buscarProducto.getProducto()!=null) {
		return buscarProducto.getProducto();}
		else {return null;}
				
	}

	public double consultarPrecio(String codigoCelda) {
		Celda base=null;
		Celda buscarPrecio=null;
				
		//funcion buscar
		for (int i=0;i<celdas.size();i++) {
			base=celdas.get(i);
			if(codigoCelda.equals(base.getCodigo())) {
				buscarPrecio=base;
			}				
		}
		// Verificar si se encontró la celda y si contiene un producto
		if (buscarPrecio != null && buscarPrecio.getProducto() != null) {
			return buscarPrecio.getProducto().getPrecio();}
		else {
			return 0.0;
		}
	}

	
	public Celda buscarCeldaProducto(String codigoCelda) {
		Celda base=null;
		Celda buscarCelda=null;
				
		//funcion buscar
		for (int i=0;i<celdas.size();i++) {
			base=celdas.get(i);
			//Se salta los arreglos que estan en null 
			if(base.getProducto() != null && codigoCelda.equals(base.getProducto().getCodigo())) {
				buscarCelda=base;
			}				
		}
		
		return buscarCelda;
		
	}


	public void incrementarProductos(String codigoCelda, int Items) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(codigoCelda);
		celdaEncontrada.setStock(Items);
	}

	public void vender(String codigoCelda) {
		Celda productoCelda;
		productoCelda=buscarCeldaProducto(codigoCelda);
		if(productoCelda !=null) {
		productoCelda.setStock(productoCelda.getStock() - 1);}
		
	}

	public double venderConCambio(String codigoCelda, double pago) {
		Celda c1;
		c1 = buscarCelda(codigoCelda);

		c1.setStock(c1.getStock() - 1);
		double precioProducto;
		precioProducto = c1.getProducto().getPrecio();
		double vuelto;
		vuelto = pago - precioProducto;
		return vuelto;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores=new ArrayList<Producto>();
		Producto elementoProducto=null;
		for(int i=0;i<menores.size();i++) {
			elementoProducto=menores.get(i);
			if(elementoProducto.getPrecio()<limite) {
				menores.add(elementoProducto);
			}
		}
		return menores;
	}
	public ArrayList<Producto> buscarMenores1(double limite) {
	    ArrayList<Producto> menores = new ArrayList<Producto>();
	    for (Celda celda : celdas) {
	        Producto producto = celda.getProducto();
	        if (producto != null && producto.getPrecio() < limite) {
	            menores.add(producto);
	        }
	    }
	    return menores;
	}
}
