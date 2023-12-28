package mazo_cartas;

public class uso_baraja {

	public static void main(String[] args) {
		Baraja mazo_1 = new Baraja();
		System.out.println("-----------BARAJA ORDENADA-----------");
		System.out.println(mazo_1);
		
		
		System.out.println("-----------BARAJA DESORDENADA-----------");
		mazo_1.Barajar();
		for (int i = 0; i < 5; i++) {
			System.out.println(mazo_1);
		}
		
		System.out.println("-----------REPARTIR----------------");
		
		for (int i = mazo_1.getMano(); i < 5; i++) {
			System.out.println(mazo_1.repartirCartas());
		}


	}

}
