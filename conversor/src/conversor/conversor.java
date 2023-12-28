package conversor;
import java.util.Scanner;

public class conversor {

	public static float convertir(float temp, int opc) {
		switch (opc) {
		case 1:
			//f-->c
			return (5f/9)*(temp-32);
			
		case 2:
			//c-->k
			return (float) (temp+273.15);
		
		case 3:
			//c-->f
			return (float)(temp*9/5)+32;
			
		case 4:
			//f-->k
			return (float)((temp+32)*5/9+273.15);
			
		case 5:
			//k-->c
			return (float)(temp-273.15);
			
		case 6:
			//k -->f
			return (float)((temp-273.15)*9/5+32);
		default:
			return -1;
			
			

		}
	}
	
	public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la temperatura en celsius, farenhiet o kelvin: ");
        float temperatura=teclado.nextFloat();
        System.out.println("Ahora selecciona alguna de las opciones a realizar");
        System.out.println("1 para pasar de Farenheit a Celsius");
        System.out.println("2 para pasar de celsius a kelvin ");
        System.out.println("3 para pasar de celsius a farenheit");
        System.out.println("4 para pasar de farenheit a kelvin");
        System.out.println("5 para pasar de kelvin a celsius");
        System.out.println("6 para pasar de kelvin a farenheit");
        
        System.out.print("Opcion: ");
        int opcion=teclado.nextInt();
        
        switch (opcion) {
		case 1:
			System.out.printf("%f farenheit = %f celsius",temperatura,convertir(temperatura,opcion));
			break;
		
		case 2:
			System.out.printf("%f celsius = %f kelvin",temperatura,convertir(temperatura,opcion));
			break;

		case 3:
			System.out.printf("%f celsius = %f farenheit",temperatura,convertir(temperatura,opcion));
			break;

		case 4:
			System.out.printf("%f farenheit = %f kelvin",temperatura,convertir(temperatura,opcion));
			break;

		case 5:
			System.out.printf("%f kelvin = %f celsius",temperatura,convertir(temperatura,opcion));
			break;

		case 6:
			System.out.printf("%f kelvin = %f farenheit",temperatura,convertir(temperatura,opcion));
			break;

		}

        
        
		
	}
	
	

}
