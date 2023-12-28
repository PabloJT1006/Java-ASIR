package jakaeaPalabras;



import java.io.*;

public class jakeaPalabras {
	public static String cesar(String cadena) {
		String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
		String cadenaCod="";
        for (int i = 0; i < cadena.length() ; i++) {
            for (int j=0; j < abc.length(); j++) {
                if (cadena.charAt(i)==abc.charAt(j)) {
                    cadenaCod+=abc.charAt((j+5)%abc.length());
                }
            }
        }
        cadena=cadenaCod;
        return cadena;
    }
		
	

	public static void main(String[] args) {
		File fichero=null;
		FileReader reader = null;
		BufferedReader buffer = null;
		File fich = null;
		FileWriter writer = null;
		PrintWriter pw = null;
		try {
			fichero = new File("C:\\Users\\JTP10\\eclipse-workspace\\jakaeaPalabras\\src\\jakaeaPalabras\\jakeaPalabras.java");
			reader = new FileReader(fichero);
			buffer = new BufferedReader(reader);
			
			String linea;
			String cod = "";
			
			fich = new File("C:\\Users\\JTP10\\OneDrive\\Escritorio\\textoCifrado.txt");
			writer = new FileWriter(fich);
			pw = new PrintWriter(writer);
			int cont=0;
			
			while( (linea=buffer.readLine()) != null) {
				 cod=cesar(linea);
				 pw.printf("%d. %s \n",cont,cod);
				 cont++;
				
			}
			
			writer.close();
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}



