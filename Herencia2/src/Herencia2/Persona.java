package Herencia2;

import java.util.Date;
import java.util.Random;

class Persona {
	private String nombre;
	private Date fechaNacimiento;
	private int dni;
	
	public Persona(String nombre, int dni){
		Random rnd=new Random();
		Date fecha=new Date(-946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000)));
		this.nombre = nombre;
		this.fechaNacimiento=fecha;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + "]";
	}
	
	
	
	
	
}
