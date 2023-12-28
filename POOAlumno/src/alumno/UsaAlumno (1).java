
public class UsaAlumno {
    public static void main(String[] args) throws Exception {
    	//System.out.println(Alumno.numalumnos);
    	Alumno.imprimeNumAlumnos();
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

        String n="Bartolo",a="Gómez";
        Alumno raro=new Alumno(n,a,1966);
        System.out.println(raro+"\n");
        Alumno.imprimeNumAlumnos();
        /*System.out.println(raro.getNombre());
        System.out.println(raro.getApellidos());
        System.out.println(raro.getAnioNacimiento());
        System.out.println(raro.getNumPersonal());
        System.out.println(raro.getGrupo());
        System.out.println(raro.getHorario());*/
    }
}
