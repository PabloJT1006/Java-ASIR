package alumno;
import java.util.Scanner;



import java.util.ArrayList;

public class UsaAlumno {
    public static void main(String[] args)  {
    	//System.out.println(Alumno.numalumnos);
    	/*Alumno.imprimeNumAlumnos();
        Alumno raul=new Alumno("Raúl","Fernández Guardeño");
        System.out.println("\n"+raul);
        System.out.println("------------------------");
    	Alumno tu = new Alumno("Iván","El Meon",2000);
        System.out.println(tu);
        System.out.println("------------------------");
        Alumno el=new Alumno();
        System.out.println(el);
        System.out.println("------------------------");
        
        /*raul.setNombre("Raúl","Fernandez Guardeño");
        raul.setApellidos("Fernandez Guardeño");
        raul.setAnioNacimiento(1998);
        raul.setNumPersonal(2);
        raul.setGrupo("2ASIR");
        raul.setHorario(Horario.MAÑANA);*/
        
      //coherción explícita = llama al metodo toString si existe aunque no llames al método en sí

        /*String n="Bartolo",a="Gómez";
        Alumno raro=new Alumno(n,a,1966);
        System.out.println(raro+"\n");
        Alumno.imprimeNumAlumnos();
        /*System.out.println(raro.getNombre());
        System.out.println(raro.getApellidos());
        System.out.println(raro.getAnioNacimiento());
        System.out.println(raro.getNumPersonal());
        System.out.println(raro.getGrupo());
        System.out.println(raro.getHorario());*/
        
        /*NUMERO ALEATORIOS DE ALUMNOS QUE SE CREEN CON DOS MATRICES, UNA DE NOMBRES Y OTRA DE APELLIDOS
         * 1- CREAR MATRIZ DE NOMBRES
         * 2.-CREAR MATRIZ DE apellidos
         * 3.-PEDIR LA CANTIDAD DE ALUMNOS
         * 4- HACER UN ARRAYLIST DE ALUMNOS
         * 5.-CON EL CONSTRUCTOR IR GENERANDO ALUMNOS Y COMPROBAR SI SE REPITEN */
        
        String[] nombres= {"Daniel","Sergio","Miguel","Alejandro","Juan","Raul","Jose","Mohamed","Miguel","Samuel","Pablo","Francisco"};
        String[] apellidos= {"Garcia","Gonzalez","Torres","Jiménez","Galvín","Galvez","Blanco","Franco","Folgeiras","Rabad","Matamoros","Macaçiño"};

        System.out.print("Introduce la cantidad de alumnos que quieres introducir: ");
        Scanner teclado=new Scanner(System.in);
        int cantidad = teclado.nextInt();
        teclado.close();
        ArrayList<Alumno1> listaAlumnos = new ArrayList<Alumno1>(cantidad);
		
		
		if (cantidad>nombres.length || cantidad<0) {
			System.out.println("Cantidad de alumnos fuera del rango permitido");

		} else {
			
			
			for (int i = 0; i < cantidad; i++) {
				Alumno1 generado = new Alumno1(nombres[(int) (Math.random()*nombres.length+1)],apellidos[(int) (Math.random()*nombres.length+1)]);
				listaAlumnos.add(generado);
				System.out.println(generado);
				int pos=listaAlumnos.indexOf(generado);
		}
	
		}
    }
}
		
		
		
   
    
    
    	
		
  
    

	
    

	

