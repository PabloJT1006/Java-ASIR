package persona;

public class Usa_herencia {

	public static void main(String[] args) {
		String[] nombres= {"Daniel","Sergio","Miguel","Alejandro","Juan","Raul","Jose","Mohamed","Miguel","Samuel","Pablo","Francisco"};
        String[] apellidos= {"Garcia","Gonzalez","Torres","Jiménez","Galvín","Galvez","Blanco","Franco","Folgeiras","Rabad","Matamoros","Macaçiño"};
        String[] grupos= {"1ASIR","2ASIR","1ESO","2ESO","3ESO","4ESO","1BACH","2BACH","1GAT","2GAT","1ESTO","2EST"};
        String[] asignatura= {"SRI","LM","ASGBD","Matematicas","Lengua","Ingles"};
        
        Persona[] instituto= new Persona[10];
        
        for (int i = 0; i < instituto.length; i++) {
			int tipo=(int)(Math.random()*3);
			String nom=nombres[(int)(Math.random()*nombres.length)];
			String apel=apellidos[(int)(Math.random()*apellidos.length)];
			int dni=(int)(Math.random()*100+1);
			
				switch (tipo) {
				case 0: 
					instituto[i]=new Persona(nom,apel,dni);
					break;
				case 1:
					String grup=grupos[(int)(Math.random()*grupos.length)];
					Horario turno;
				
					if (Math.random()<=0.8) {
						turno=Horario.MAÑANA;
					}
					else {
						turno=Horario.TARDE;
					}
					instituto[i]=new Alumno(nom,apel,dni,grup,turno);
					
					break;
			
				case 2:
					String curso=grupos[(int)(Math.random()*grupos.length)];
					String asig=asignatura[(int)(Math.random()*asignatura.length)];
					int antig=(int)(Math.random()*30+1);
					instituto[i]=new Profesor(nom, apel, dni,asig,curso,antig);		
				break;
			}
		}
        
        
		/*Persona pablo = new Persona("Pablo", "Jiménez", 1);
		System.out.println(pablo);
		System.out.println(pablo.getNombre());
		
		Alumno juan = new Alumno("Juan", "Ramirez", 2, "2ASIR", Horario.MAÑANA);
		System.out.println(juan);
		
	
		
		Profesor fVillalba = new Profesor("Francisco","Villalba",4,"SRI","2ASIR",20);
		System.out.println(fVillalba);*/
        
        for (Persona persona : instituto) {
        	System.out.println(persona);
		}
        
       // for (int i = 0; i < instituto.length; i++) {
		//	System.out.println(instituto[i]);
		//}
		
    	//ejercicio: establecer el grupo y horario a migue
		Persona mgutierrez= new Alumno("Miguel Angel","Gutierrez",3);
		if (mgutierrez instanceof Alumno) {
			Alumno nuevo =(Alumno)mgutierrez;
			nuevo.setGrupo("2ºASIR");
			nuevo.setHorario(Horario.TARDE);
			mgutierrez=nuevo;
		}
		System.out.println(mgutierrez);
        
        
	}
	

}
