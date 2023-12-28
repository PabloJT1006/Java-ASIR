package baraja;

import enumerados.Colores;
import enumerados.Efectos;

public class BarajaUno extends Baraja<CartaUno> {
	
	public BarajaUno() {
		this.numCartas=108;
		this.cartasPorPalo=13;
		
		this.crearBaraja();
		this.barajar();
	}
	
	
	public void crearBaraja() {
		Colores [] color = Colores.values();
		
		for (Colores colores : color) {
			
			if (colores!= Colores.NEGRO) {
				for (int i = 0; i < this.cartasPorPalo; i++) {
					if (i>9) {
						switch (i) {
							case 10:
								this.cartas.push(new CartaUno(Efectos.MASDOS,colores));
								break;
							case 11:
								this.cartas.push(new CartaUno(Efectos.BLOQUEO,colores));
								break;
							case 12:
								this.cartas.push(new CartaUno(Efectos.REVEERSO,colores));
								break;
						}
						
					} else {
						this.cartas.push(new CartaUno(i,colores));
						
					}
					
				}
				
				
			} else {
				
				for (int i = 0; i < 4; i++) {
					this.cartas.push(new CartaUno(Efectos.MASCUATRO,colores));
					this.cartas.push(new CartaUno(Efectos.CAMBIOCOLOR,colores));


				}
				
			}
		}
	}
}
