package Herencia2;

import java.util.Scanner;

import persona.Alumno;
import persona.Horario;
import persona.Persona;
import persona.Profesor;

public class UsoHerencia2 {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Pablo",1);
		System.out.println(persona1);
		Persona persona2 = new Persona("Javi",2);
		System.out.println(persona2);
		
		Estudiante estudiante1 = new Estudiante("Lucia",3,94,9);
		System.out.println(estudiante1);
		
		Empleado empleado1 = new Empleado("Roberto",5,1000);
		System.out.println(empleado1);
		
		EmpleadoComision comison1 = new EmpleadoComision("Ruben",6,1000,200,20);
		System.out.println(comison1);
		
		String[] nombres= {"Daniel","Sergio","Miguel","Alejandro","Juan","Raul","Jose","Mohamed","Miguel","Samuel","Pablo","Francisco"};
		Scanner teclado=new Scanner(System.in);
		System.out.print("Escriba cuantas personas desea crear: ");
		int lim = teclado.nextInt();
		Persona[] empresa= new Persona[lim];
		int numper = 0,numest = 0,numemp = 0,numempcom=0;
        
        for (int i = 0; i < empresa.length; i++) {
			int tipo=(int)(Math.random()*4);
			String nom=nombres[(int)(Math.random()*nombres.length)];
			int dni=(int)(Math.random()*100+1);
			
				switch (tipo) {
				case 0: 
					numper++;
					empresa[i]=new Persona(nom,dni);
					break;
				case 1:
					numemp++;
					int sueldo=(int)(Math.random()*2000+1000);
					empresa[i]=new Empleado(nom,dni,sueldo);
					
					break;
			
				case 2:
					numempcom++;
					int sueldo1=(int)(Math.random()*2000+1000);
					int ventas=(int)(Math.random()*5000);
					double comision=(double)(Math.random()*100+1);
					empresa[i]=new EmpleadoComision(nom,dni,ventas,sueldo1, comision);		
				break;
				default:
					numest++;
					int total=(int)(Math.random()*100+1);
					int cantidad=(int)(Math.random()*10+10);
					empresa[i]=new Estudiante(nom,dni,total,cantidad);

					
			}
				
			System.out.println("-----------------------GENERADOS ALEATORIOS----------------------------");
			System.out.printf("Personas: %2d Estudiantes: %2d Empleados:%2d EmpleadosComision: %2d",numper,numest,numemp,numempcom);
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
			for (Persona persona : empresa) {
	        	System.out.println(persona);
			}
		}
		

		
	}

}
