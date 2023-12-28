package ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
	
	public static StringBuilder genera_ip() {
		int x;
        StringBuilder IP = new StringBuilder();


		for (int i = 0; i < 4; i++) {
			x=(int)(Math.random()*255);
			IP.append(x);
			IP.append(".");

		}
		return IP;
		
	}
	
	
	
	public static void main(String[] args) {
        StringBuilder Lista_IP = new StringBuilder();
		
		for (int i = 0; i < 100; i++) {
			Lista_IP.append("[");
			Lista_IP.append(genera_ip());
			Lista_IP.append("]");
			
		}
		
		System.out.println(Lista_IP);
		
		
		

	
	
	
	
	}

}
