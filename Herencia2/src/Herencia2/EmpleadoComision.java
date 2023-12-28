package Herencia2;

import java.util.Date;

class EmpleadoComision extends Empleado {
	private	int dineroVentas;
	private double porcentajeComision;
	
	
	
	public EmpleadoComision(String nombre, int dni, int sueldoBase, int dineroVentas, double porcentajeComision) {
		super(nombre, dni, sueldoBase);
		this.dineroVentas = dineroVentas;
		this.porcentajeComision = porcentajeComision;
	}
	public double getPorcentajeComision() {
		return porcentajeComision;
	}
	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	public int getDineroVentas() {
		return dineroVentas;
	}
	public void setDineroVentas(int dineroVentas) {
		this.dineroVentas = dineroVentas;
	}
	
	public int getSueldo() {
		return (int) (this.getSueldoBase()+this.dineroVentas*(this.porcentajeComision/100));
	}
	@Override
	public String toString() {
		return "Empleado Comision [Nombre= "+getNombre()+" Fecha Nacimiento= " +getFechaNacimiento()+" Sueldo Total= " + getSueldo() + "]";
		
	
	}
	
	
}
