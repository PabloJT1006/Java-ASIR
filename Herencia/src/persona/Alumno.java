package persona;

import java.util.Objects;

enum Horario{MAÑANA,TARDE};

public class Alumno extends Persona {
	protected String grupo;
	protected Horario horario;
	
	
	
	public Alumno(String nombre, String apellidos, int dni) {
		super(nombre, apellidos, dni);
		// TODO Auto-generated constructor stub
	}



	public Alumno(String nombre, String apellidos, int dni, String grupo, Horario horario) {
		super(nombre, apellidos, dni);
		this.grupo = grupo;
		this.horario = horario;
	}
	
	
	
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(grupo, horario);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(grupo, other.grupo) && horario == other.horario;
	}



	@Override
	public String toString() {
		return "Alumno [nombre= "+this.getNombre()+" apellidos= "+this.getApellidos()+" dni="+this.getDni()+ " grupo=" + grupo + ", horario=" + horario +"]";
	}
	

}
