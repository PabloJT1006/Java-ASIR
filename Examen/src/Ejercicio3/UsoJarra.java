package Ejercicio3;

public class UsoJarra {

	public static void main(String[] args) {
		Jarra jarraA = new Jarra(7,4);
		Jarra jarraB = new Jarra(7,4);
		
		System.out.println("A "+jarraA);
		System.out.println("B "+jarraB);
		System.out.println("------LLenar Jarra A con Jarra B--------");
		jarraA.llena();
		System.out.println("A "+jarraA);
		System.out.println("B "+jarraB);
		System.out.println("------Volcar jarraA sobre jarraB--------");
		jarraB.llenaDesde(jarraA);
		System.out.println("A "+jarraA);
		System.out.println("B "+jarraB);
		System.out.println("------Vaciar jarraB--------");
		jarraB.vaciar();
		System.out.println("A "+jarraA);
		System.out.println("B "+jarraB);
		System.out.println("------Volcar jarraA sobre jarraB--------");
		jarraB.llenaDesde(jarraA);
		System.out.println("A "+jarraA);
		System.out.println("B "+jarraB);


	}

}
