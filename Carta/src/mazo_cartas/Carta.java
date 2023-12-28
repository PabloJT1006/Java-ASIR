package mazo_cartas;

import java.util.Objects;

public class Carta {
	private String valor;
	private String palo;
	
	
	
	public Carta() {
		super();
	}
	
	public Carta(String palo, String valor) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public void setPalo(String palo) {
		this.palo = palo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return this.valor+" de "+this.palo ;
	} 
	
	
	
	
	
	

}


