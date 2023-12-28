package baraja;

import enumerados.Colores;
import enumerados.Efectos;

public class CartaUno extends Carta<Colores> {
	private Efectos efecto;

	public CartaUno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartaUno(int numero, Colores color) {
		super(numero, color);
		// TODO Auto-generated constructor stub
	}

	public CartaUno( Efectos efecto, Colores color) {
		super(-1, color);
		this.efecto = efecto;
		
	}

	public Efectos getEfecto() {
		return efecto;
	}

	public boolean especial() {
		return this.efecto!=null;
	}

	@Override
	public String toString() {
		String estado="";
		
		if (this.especial()) {
			
			switch (this.efecto) {
				case MASDOS:
					estado= "+2 "+palo;
					break;
				case MASCUATRO:
					estado= "+4";
					break;
				case BLOQUEO:
					estado= "Salto de turno "+palo;
					break;
				case REVEERSO:
					estado= "Cambio de sentido"+palo;
					break;
				case CAMBIOCOLOR:
					estado= "Cambio color";
					break;
			}
			
		} else {
			estado = numero + " "+palo;
		}
		return estado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
