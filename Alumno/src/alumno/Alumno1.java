package alumno;

import java.util.Objects;

enum Horario { MAÑANA,TARDE}

public class Alumno1 implements Comparable <Alumno1> {
	//Atributos
    private String nombre;
    private String apellidos;
    private int anioNacimiento;
    private int numPersonal;
    private String grupo;
    private Horario horario = Horario.MAÑANA;
    //al poner static, es compartido entre todos los elementos de la clase
    private static int numalumnos=0;
    

    
    //Metodos para el objeto
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//SOBRECARGA
	public void setNombre(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public int getNumPersonal() {
		return numPersonal;
	}
	public void setNumPersonal(int numPersonal) {
		this.numPersonal = numPersonal;
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
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", anioNacimiento=" + anioNacimiento
				+ ", numPersonal=" + numPersonal + ", grupo=" + grupo + ", horario=" + horario 
				+ ", totalalumnos= "+numalumnos+ "]";
	}
	
	//Constructores
	
	
	
	public Alumno1(String nombre,String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		
	}
	public Alumno1() {
		super();
	}
	
	public Alumno1(String nombre,String apellidos,int anioNacimiento) throws Exception{
		super();
		if (nombre==null || apellidos==null) throw new Exception("Argumentos no válidos");
		if (anioNacimiento < 1950) throw new Exception("Año incorrecto");
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anioNacimiento;
		this.numalumnos++;
	}
	
	public static void imprimeNumAlumnos() {
		System.out.println("totalAlumnos= "+Alumno1.numalumnos);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno1 other = (Alumno1) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	

	public int compareTo(Alumno1 o) {
		if(this.apellidos.compareToIgnoreCase(o.apellidos)==0)
			return this.nombre.compareToIgnoreCase(o.nombre);
		else
			return this.apellidos.compareToIgnoreCase(o.apellidos);
	}
	
	
	
}