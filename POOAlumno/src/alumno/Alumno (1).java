enum Horario { MAÑANA,TARDE}

class Alumno {
	//Atributos
    private String nombre;
    private String apellidos;
    private int anioNacimiento;
    private int numPersonal;
    private String grupo;
    private Horario horario = Horario.MAÑANA;
    static int numalumnos=0;
    
    //atributos de clase (static)
    
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
	public Alumno(String nombre,String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numalumnos++;
	}
	public Alumno(String nombre,String apellidos,int anioNacimiento) throws Exception{
		super();
		if (nombre==null || apellidos==null) throw new Exception("Argumentos no válidos");
		if (anioNacimiento < 1950) throw new Exception("Año incorrecto");
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anioNacimiento;
		this.numalumnos++;
	}
	public Alumno() {
		super();
		this.nombre="Perico";
		this.apellidos="De los Palotes";
		this.numalumnos++;
	}
	static void imprimeNumAlumnos() {
		System.out.println("totalAlumnos= "+Alumno.numalumnos);
	}
	
	
}