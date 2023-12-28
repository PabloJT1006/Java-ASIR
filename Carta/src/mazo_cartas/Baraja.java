package mazo_cartas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
	Carta[] mazo;
	private int mano=0;
	private int tam;
	
	public Baraja() {
		String[]valores= {"As","1","2","3","4","5","6","7","8","9","10","Sota","Caballo","Rey"};
		String[]palos= {"Oros","Copas","Espadas","Bastos"};
		int contador=0;
		this.tam=(valores.length)*(palos.length);
		mazo=new Carta[tam];
		
		for (int i = 0; i < palos.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				mazo[contador]=new Carta(palos[i],valores[j]);
				contador++;
			}
		}
		
	}
	
	

	public Carta[] getMazo() {
		return mazo;
	}



	public void setMazo(Carta[] mazo) {
		this.mazo = mazo;
	}



	public int getMano() {
		return mano;
	}



	public void setMano(int mano) {
		this.mano = mano;
	}



	public int getTam() {
		return tam;
	}



	public void setTam(int tam) {
		this.tam = tam;
	}



	@Override
	public String toString() {
		String res="";
		for (int i = 1; i <= mazo.length; i++) {
			res+=String.format("%2d %-19s",i,mazo[i-1]);
			if(i%4==0)res+="\n"; 
		
			
		}
		return res;
	}
	
	public void Barajar() {
		mano=0;
		List<Carta>cartasList=Array.asList(mazo);
		Collections.shuffle(cartasList);
		cartasList.toArray(mazo);
		
		
		
		Carta temp = new Carta();
		for (int primera = 0; primera < mazo.length; primera++) {
			int segunda=(int)(Math.random()*mazo.length);
			temp=mazo[primera];
			mazo[primera]=mazo[segunda];
			mazo[segunda]=temp;
		}
	}
	
	public Carta repartirCartas() {
		if (this.mano<mazo.length) {
			Carta aux=mazo[this.mano];
			this.mano++;
			return aux;
		}else {
			return null;
		}
	}
	
	
	
	
	
}
	
	
	
	

