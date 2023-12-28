package bombilla;

public class bombilla {
	String sitio;
	Boolean estado;
	int potencia;
	int tiempo;
	
	
	public bombilla() {
		super();
	}


	public bombilla(String sitio, Boolean estado) {
		this.sitio = sitio;
		this.estado = estado;
		this.potencia=(int)(Math.random());
	}


	public bombilla(String sitio, Boolean estado, int potencia, int tiempo) {
		this.sitio = sitio;
		this.estado = estado;
		this.potencia = potencia;
		this.tiempo = tiempo;
	}


	public String getSitio() {
		return sitio;
	}


	public void setSitio(String sitio) {
		this.sitio = sitio;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public float coste () {
		return (float) (0.2*tiempo*(potencia/1000));
	}


	@Override
	public String toString() {
		return  String.format("bombilla [sitio=" + sitio + ", estado=" + estado + ", potencia=" + potencia + ", tiempo=" + tiempo
				+ "]");
	}
	
	
	
}
