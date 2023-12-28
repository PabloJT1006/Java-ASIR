package bombilla;

import java.util.ArrayList;

public class CASA {
	ArrayList<bombilla>bombillas=new ArrayList<>(10);
	

	public CASA() throws Exception {
		String[] lugares={"Salón","Cocina","Baño","Dormitorio 1","Dormitorio 2","Dormitorio 3","Entrada","Balcón"};

	}
	
	public float consumoTotal() {
		float suma=0;
		for (bombilla bombill : bombillas) {
			suma+=bombill.coste();
		}
		return suma;
	}

	@Override
	public String toString() {
		String res;
		res=("Casa[ ");
		for (int i = 0; i < bombillas.size(); i++) {
			res+=String.format("Bombilla %d : %s \n",i, bombillas.get(i).toString());
		}
		res+=String.format("Consumo: %f €",consumoTotal());
		return res;
	}
	
	
	
	
}
