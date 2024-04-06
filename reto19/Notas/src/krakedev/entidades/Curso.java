package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	// Crear e intanciar arreglo estudiantes

	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	// matricularEstudiante
	public void matricularEstudiante(Estudiante estudiante) {
		String cedulaEsctudiante;
		String estudianteEncontrado;

		estudianteEncontrado = estudiante.buscarEstudiantePorCedula(estudiante.getCedula());
		if (estudianteEncontrado != null) {
			System.out.println(
					"El estudiante con numero deC.I.: " + estudianteEncontrado + " ya se encuantra matriculado");
		} else {
			estudiantes.add(estudiante);
			System.out.println("Se a registrado un nuevo estudiante");
		}
	}

	// calcular Promedio
	public double calcularPromedioCurso() {
		double sumaPromedio = 0.0;
		int totalEstudiantes = estudiantes.size();
		Estudiante estudiante;
		ArrayList<Nota> notaEstudiante;
		double sumaNotas;
		int totalMaterias;
		Nota nota;
		double promedioEstudiante;
		if (totalEstudiantes > 0) {
			for (int i = 0; i < totalEstudiantes; i++) {
				estudiante = estudiantes.get(i);
				notaEstudiante = estudiante.getNotas();
				sumaNotas = 0.0;
				totalMaterias = notaEstudiante.size();
				if (totalMaterias > 0) {
					for (int j = 0; j < totalMaterias; j++) {
						nota = notaEstudiante.get(j);
						sumaNotas = sumaNotas + nota.getCalificacion();

					}
					promedioEstudiante = sumaNotas / totalMaterias;
					sumaPromedio = sumaPromedio + promedioEstudiante;
				}
			}
			return sumaPromedio / totalEstudiantes;
		} else {
			return 0.0;
		}

	}

	// Mostrar
	public void mostrar() {
		System.out.println("Curso: [estudiantes=[");
		int totalEstudiantes=estudiantes.size();
		Estudiante estudiante;
		ArrayList<Nota> notaEstudiantes;
		int totalNotas;
		
		Nota nota;
		
		for (int i = 0; i < totalEstudiantes; i++) {
			estudiante=estudiantes.get(i);
			System.out.println("Estudiante: [nombre="+estudiante.getNombre()+", Apellido "+estudiante.getApellido()+", cedula "+estudiante.getCedula()+", Notas[");
			notaEstudiantes = estudiante.getNotas();
			totalNotas=notaEstudiantes.size();
			for (int j = 0; j < totalNotas; j++) {
				nota=notaEstudiantes.get(j);
				System.out.println("Materia [codigo= "+nota.getMateria().getCodigo()+", nombre "+nota.getMateria().getNombre()+", calificacion "+nota.getCalificacion()+"]");
				if(j<totalNotas-1) {
					System.out.println(",");
				}
				
			}
			System.out.println("]");
			if(i<totalEstudiantes-1) {
				System.out.println(",");
			}
		}
		System.out.println("]]");
	}

	// get & set

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
