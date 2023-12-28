package n.naturales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class naturales {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader buffer = null;
		File fich = null;
		FileWriter writer = null;
		PrintWriter pw = null;
	
		try {
			
			
			fich = new File("C:\\Users\\JTP10\\OneDrive\\Escritorio\\textoCifrado.txt");
			writer = new FileWriter(fich);
			pw = new PrintWriter(writer);
			
			reader = new FileReader(fich);
			reader.read();
			
			for (int i = 0; i < 101; i++) {
				pw.println(i);
				}
			
			String linea;
			while( (linea=buffer.readLine()) != null) {
				 System.out.println(linea);
				 
				
			}
			buffer.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
