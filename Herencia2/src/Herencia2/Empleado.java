package Herencia2;

class Empleado extends Persona {
	private	int sueldoBase;
	
	

	public Empleado(String nombre, int dni, int sueldoBase) {
		super(nombre, dni);
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre= "+getNombre()+" Fecha Nacimiento= " +getFechaNacimiento()+" Sueldo Base= " + sueldoBase +"]";
		
	}
	
	
	
	
	
	

}
