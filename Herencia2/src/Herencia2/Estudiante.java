package Herencia2;

import java.util.Date;

class Estudiante extends Persona {
	private	int puntuacionTotal;
	private int numeroCalificaciones;
	
	
	
	public Estudiante(String nombre, int dni, int puntuacionTotal, int numeroCalificaciones) {
		super(nombre, dni);
		this.puntuacionTotal = puntuacionTotal;
		this.numeroCalificaciones = numeroCalificaciones;
	}
	
	//poner this solo cuando hay ambiguedad
	public void nuevaCalificacion(int nota) {
		this.puntuacionTotal+=nota;
		this.numeroCalificaciones+=1;
	}
	
	//hacer conversion ya que la division devuelve un double
	public double getNotaMedia() {
		return (numeroCalificaciones==0)?0: (double) this.puntuacionTotal/this.numeroCalificaciones;
	}

	@Override
	public String toString() {
		return "Estudiante [Nombre= "+getNombre()+"Fecha Nacimiento= "+getFechaNacimiento()+"puntuacionTotal=" + puntuacionTotal + ", numeroCalificaciones=" + numeroCalificaciones+"Media= "+getNotaMedia()+ "]";
	}
	
	
	
	
	
	
}
