package fecha;

public class UsoFecha {


	public static void main(String[] args) {
		fecha ejercicio2 = new fecha();
		
		ejercicio2.setDia(45);
		ejercicio2.setMes(-90);
		ejercicio2.setAño(-90);
		
		ejercicio2.comprobar_dias();
		ejercicio2.comprobar_mes();
		
		System.out.println(ejercicio2);


		
	}

}
