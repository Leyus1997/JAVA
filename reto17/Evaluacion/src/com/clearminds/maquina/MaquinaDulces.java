package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo=1.5499999999999998;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);

	}

	public void mostrarConfiguracion() {
		System.out.println("** CELDAS **");
		System.out.println("Celda 1 : " + celda1.getCodigo());
		System.out.println("Celda 2 : " + celda2.getCodigo());
		System.out.println("Celda 3 : " + celda3.getCodigo());
		System.out.println("Celda 4 : " + celda4.getCodigo());
		System.out.println("Saldo actual : " + saldo);
		System.out.println("*********");
	}

	public Celda buscarCelda(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			return celda1;
		} else if (celda2.getCodigo() == codigoCelda) {
			return celda2;
		} else if (celda3.getCodigo() == codigoCelda) {
			return celda3;
		} else if (celda4.getCodigo() == codigoCelda) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto p1, String codigoCelda, int Items) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, Items);
	}

	public void mostrarProductos() {
		System.out.println("***** CELDA A1");
		imprimirDetallesCelda(celda1);
		System.out.println("***** CELDA A2");
		imprimirDetallesCelda(celda2);
		System.out.println("***** CELDA B1");
		imprimirDetallesCelda(celda3);
		System.out.println("***** CELDA B2");
		imprimirDetallesCelda(celda4);
	}

	public void imprimirDetallesCelda(Celda celda) {
		if (celda != null) {
			System.out.println("saldo :" + saldo);
			System.out.println("Stock :" + celda.getStock());

			if (celda.getProducto() != null) {
				System.out.println("nombre :" + celda.getProducto().getNombre());
				System.out.println("precio :" + celda.getProducto().getPrecio());
				System.out.println("codigo :" + celda.getProducto().getCodigo());
			} else {
				System.out.println("No tiene producdo");
			}

		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigoCelda) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigoCelda) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigoCelda) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigoCelda) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigoCelda) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigoCelda) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}

	}

	
	public Celda buscarCeldaProducto(String codigoCelda) {
	    if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == (codigoCelda)) {
	        return celda1;
	    } else if (celda2.getProducto() != null && celda2.getProducto().getCodigo()==(codigoCelda)) {
	        return celda2;
	    } else if (celda3.getProducto() != null && celda3.getProducto().getCodigo()==(codigoCelda)) {
	        return celda3;
	    } else if (celda4.getProducto() != null && celda4.getProducto().getCodigo()==(codigoCelda)) {
	        return celda4;
	    } else {
	        return null; // El producto no se encontró en ninguna celda
	    }
	}


	public void incrementarProductos(String codigoCelda, int Items) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(codigoCelda);
		celdaEncontrada.setStock(Items);
	}

	public void vender(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			celda1.setStock(celda1.getStock() - 1);
		} else if (celda2.getCodigo() == codigoCelda) {
			celda2.setStock(celda2.getStock() - 1);
		} else if (celda3.getCodigo() == codigoCelda) {
			celda3.setStock(celda3.getStock() - 1);
		} else if (celda4.getCodigo() == codigoCelda) {
			celda4.setStock(celda4.getStock() - 1);
		}
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
	
	
	
}
