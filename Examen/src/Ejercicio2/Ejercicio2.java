package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
	
	//funcion recursiva que saca el factorial de un numero
	public static int facto(int numero) {
        if (numero==0) return 1;
        else{
            return numero*facto(numero-1);
        }
    }
	
	//funcion que saca los digitos de un numero y calcula su factorial con la funcion anterior
	public static int sum_fact_digt(int n){
        int temp=0;
        int suma=0;
        while(n != 0) {
           temp =  (n % 10);
           n /= 10;
           suma+= facto(temp);
            
        }
        return suma;
    }
	

	//programa principal
	public static void main(String[] args) {
		ArrayList<Integer> iguales= new ArrayList<>();

		for (int i = 1; i <= 100000; i++) {
			if (sum_fact_digt(i)==i){
				iguales.add(i);
			} 
		}
		
		for (Integer numero : iguales) {
			System.out.printf("| %4d |",numero);
			System.out.println();
			System.out.println("---------");
		}
	}

}
