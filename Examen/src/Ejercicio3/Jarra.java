package Ejercicio3;

public class Jarra {
	int  capacidad;
	int contenido;
	
	
	public Jarra() {
		super();
	}


	public Jarra(int capacidad) {
		this.capacidad=capacidad;
		this.contenido = 0;
	}
	
	public Jarra(int capacidad, int contenido) {
		this.capacidad=capacidad;
		this.contenido = contenido;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public int getContenido() {
		return contenido;
	}
	


	public void setContenido(int contenido) {
		while (contenido<=capacidad) {
			this.contenido = contenido;
		}
	}


	public void llena() {
		contenido=capacidad;
	}
	
	public void vaciar() {
		contenido=0;
	}
	
	
	public  void llenaDesde(Jarra j) {
		while (j.contenido>0 && this.capacidad!=this.contenido) {
			this.contenido++;
			j.contenido--;
		}
	}


	@Override
	public String toString() {
		return String.format("Jarra (%s, %s)",capacidad,contenido);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
