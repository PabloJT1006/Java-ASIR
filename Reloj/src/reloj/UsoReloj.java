package reloj;

public class UsoReloj {

	public static void main(String[] args) {
		Ejercicio3 reloj = new Ejercicio3();
		Ejercicio3 reloj1 = new Ejercicio3();
		
		reloj1.setHora(18);
		reloj1.setMinutos(56);
		reloj1.setSegundos(75);
		
		System.out.print("Reloj sin parametros -> ");
		System.out.println(reloj);
		System.out.println("-----------------------------------");
		System.out.print("Reloj formato 24 horas -> ");
		System.out.println(reloj1);
		System.out.println("-----------------------------------");
		System.out.print("Reloj formato 12 horas -> ");
		System.out.println(reloj1.formato12());
		System.out.println("-----------------------------------");
		System.out.print("Reloj formato redondeando -> ");
		reloj1.relojhora();
		System.out.println(reloj1);
		
		
		
	}

}
