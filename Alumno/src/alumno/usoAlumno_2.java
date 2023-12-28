package alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class usoAlumno_2 {

	public static void main(String[] args) {
		String[] nombres= {"Daniel","Sergio","Miguel","Alejandro","Juan","Raul","Jose","Mohamed","Miguel","Samuel","Pablo","Francisco"};
        String[] apellidos= {"Garcia","Gonzalez","Torres","Jiménez","Galvín","Galvez","Blanco","Franco","Folgeiras","Rabad","Matamoros","Macaçiño"};
        
        Alumno1 yo = new Alumno1("Pablo","Jiménez");
        
        System.out.print("Introduce la cantidad de alumnos que quieres introducir: ");
        Scanner teclado=new Scanner(System.in);
        int alumnos = teclado.nextInt();
        teclado.close();
        ArrayList<Alumno1> clase = new ArrayList<>(alumnos);
        
        int aleaNom,aleaApe;
        for (int i = 0; i < alumnos; i++) {
			aleaApe=(int) (Math.random()*alumnos);
			aleaNom=(int) (Math.random()*alumnos);
			clase.add(new Alumno1(nombres[aleaNom],apellidos[aleaApe]));
		} 
        
        
        for (Alumno1 alumno1 : clase) {
				System.out.println(alumno1);
		}
        
        int pos =clase.indexOf(yo);
        
        if (pos!=-1) {
			System.out.println("Pablo Jiménez esta en la clase en la poscion: "+pos);
		} 
        else {
        	System.out.println("Pablo Jimenez no esta en la clase");
        }
        
        Collections.sort(clase);
        
        System.out.println("------------------CLASE ORDENADA-----------------------");
        for (Alumno1 alumno1 : clase) {
			System.out.println(alumno1);
		}
        
        Collections.shuffle(clase);
        clase.add(0, new Alumno1("Daniel","Sanchez"));
        
        System.out.println("------------------CLASE DESORDENADA-----------------------");
        for (Alumno1 alumno1 : clase) {
			System.out.println(alumno1);
		}
        
        System.out.println("------------------Alumnos con set-----------------------");
        Set<Alumno1> claseSet=new HashSet<>();
        claseSet.addAll(clase);
        
        for (Alumno1 alumno1 : claseSet) {
			System.out.println(alumno1);
		}
        
        System.out.println("El conjunto tiene: "+claseSet.size()+" elementos");
        
        if (claseSet.contains(clase.get(0))) {
        	System.out.println("El alumno"+clase.get(0)+" esta en el cojunto");
        }
        
        System.out.println("------------------Alumnos con Map<K,V>-----------------------");
        Map <Alumno1, Integer> claseMap = new HashMap<>();
        
        int frecuencia;
        
        for (Alumno1 alumno1 : clase) {
			if (claseMap.containsKey(alumno1)) {
				frecuencia=claseMap.get(alumno1);
				claseMap.put(alumno1, frecuencia +1);
			}
			else {
	        	claseMap.put(alumno1, 1);
	        }
		}
        //escribir un diccionario
        for (Map.Entry<Alumno1, Integer> entry : claseMap.entrySet()) {
			Alumno1 key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("["+key.getNombre()+","+key.getApellidos()+","+val+"]");
			
		}
        
        System.out.println("El diccionario contienen "+claseMap.size()+" claves");
        claseMap.remove(clase.get(0));
        System.out.println("He borrado el alumno"+clase.get(0));
            
	}

}
