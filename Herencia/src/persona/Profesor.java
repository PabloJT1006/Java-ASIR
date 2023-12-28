package persona;

public class Profesor extends Persona {
	private String asignatura;
	private String curso;
	private int antiguedad;
	
	public Profesor(String nombre, String apellidos, int dni) {
		super(nombre, apellidos, dni);
		// TODO Auto-generated constructor stub
	}

	
	
	public Profesor(String nombre, String apellidos, int dni, String asignatura, String curso, int antiguedad) {
		super(nombre, apellidos, dni);
		this.asignatura = asignatura;
		this.curso = curso;
		this.antiguedad = antiguedad;
	}



	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}



	@Override
	public String toString() {
		return "Profesor [Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + ", Dni=" + getDni()
				+ ", curso=" + curso + ", asignatura=" + asignatura + ", antiguedad=" + antiguedad + "]";
	}
	
	
	
	

}
