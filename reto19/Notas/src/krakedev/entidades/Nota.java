package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	// Constructor
	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
		}
	
	//Funcion mostrar
	public void mostrar() {
		 System.out.println("Materia nombre= " + materia.getNombre() +", Materia codigo= " + materia.getCodigo()+" , calificacion=" + calificacion);
	}
	
	//Get & set

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
		
	
}

	
	
	

