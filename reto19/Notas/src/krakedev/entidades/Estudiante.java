package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre; 
	private String apellido; 
	private String cedula; 
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	//contructor
	public Estudiante(String cedula, String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;	
	}
	
	//Agregar calificación
	public void agregarNota (Nota nuevaNota) {
		boolean validar=false;
		 Nota elementoNota=null;
		 if(nuevaNota.getCalificacion()>= 0 && nuevaNota.getCalificacion()< 10) {	 
			 for (int i=0;i<notas.size();i++) {
				 elementoNota=notas.get(i);
				 if(elementoNota.getMateria().getCodigo() == (nuevaNota.getMateria().getCodigo())) {
				 
					 validar=true; 
					 
				 
				 }
			 }
			 
			 
		 }else 
		 {System.out.println("La calificación debe estar entre 0 y 10.");}
		 
		 
		if(validar) {
			System.out.println("Codigo de materia repetido");}
		else {
			notas.add(nuevaNota);}
	}

	
	//modificarNota
	public void modificarNota(String codigo, double nuevaNota) {
		boolean validar=false;
		 Nota elementoNota=null;
		 if(nuevaNota>= 0 && nuevaNota< 10) {	 
			 for (int i=0;i<notas.size();i++) {
				 elementoNota=notas.get(i);
				 if(elementoNota.getMateria().getCodigo() == codigo) {
				 
					 validar = true;
					 break;			 
				 }
			 }
		 }else 
		 {System.out.println("La calificación debe estar entre 0 y 10.");}
		 
		 
		if(validar) {
			elementoNota.setCalificacion(nuevaNota);
			}
		else {
			System.out.println("Codigo no encontrado");}
	}
		
	//Calculo promedio
	public double calcularPromedioNotasEstudiante() {
		double sumaNotas=0.0;
		Nota elementoNotas;
		double promedioNotas;
		for(int i=0;i<notas.size();i++) {
	
			elementoNotas=notas.get(i);
			sumaNotas = sumaNotas + elementoNotas.getCalificacion(); //acumulador
		}
		promedioNotas= sumaNotas/notas.size();
		return promedioNotas;		
	}
	
	//Mostrar
	public void mostrar() {
		String infoEstudiante = "Estudiante [cedula=" + cedula + ",nombre=" + nombre + ",apellido=" + apellido + "]";
		System.out.println(infoEstudiante);
		for (int i = 0; i < notas.size(); i++) {
			String infoNota = "Nota [materia=" + notas.get(i).getMateria().getNombre() + ", calificacion="
					+ notas.get(i).getCalificacion() + "]";
			System.out.println(infoNota);
		}
	}
	
	//buscar estudiante por cedula
	public String buscarEstudiantePorCedula(String estudiante) {
		boolean validar=false;
		if(cedula.equals(estudiante)) {
			validar=true;
		}
		
		if(validar) {
			return null;
		}else {System.out.println("Estudiante no encontrado");}
		return estudiante;
		
	}
	
	
	 
	//set and get
	
	
		public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public ArrayList<Nota> getNotas() {
		return notas;
	}




	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}




	
	
	
	

	
	
}
