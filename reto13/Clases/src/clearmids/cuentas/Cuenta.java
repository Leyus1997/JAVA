package clearmids.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
		
	}
	public Cuenta(String id,String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	
	//Imprimir valores
	public void immprimir() {
		System.out.println("***********************");
		System.out.println("CUENTA");
		System.out.println("***********************");
		System.out.println("Numero de cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo);
	}
	public void imprimirConMiEstilo() {
		System.out.println("Bienvenido");
		System.out.println("Nº Cuenta :"+id);
		System.out.println("Tipo :"+tipo);
		System.out.println("Saldo disponible :"+saldo);
		System.out.println("Gracias por preferirnos");
	}
	
	public String getId() {
		return id;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		saldo = saldo;
	}
	
	
}
