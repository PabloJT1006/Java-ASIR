
public class UsaAlumno {
    public static void main(String[] args) throws Exception {
    	//System.out.println(Alumno.numalumnos);
    	Alumno.imprimeNumAlumnos();
        Alumno raul=new Alumno("Ra�l","Fern�ndez Guarde�o");
        System.out.println("\n"+raul);
        System.out.println("------------------------");
    	Alumno tu = new Alumno("Iv�n","El Meon",2000);
        System.out.println(tu);
        System.out.println("------------------------");
        Alumno el=new Alumno();
        System.out.println(el);
        System.out.println("------------------------");
        
        /*raul.setNombre("Ra�l","Fernandez Guarde�o");
        raul.setApellidos("Fernandez Guarde�o");
        raul.setAnioNacimiento(1998);
        raul.setNumPersonal(2);
        raul.setGrupo("2ASIR");
        raul.setHorario(Horario.MA�ANA);*/
        
      //coherci�n expl�cita = llama al metodo toString si existe aunque no llames al m�todo en s�

        String n="Bartolo",a="G�mez";
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
