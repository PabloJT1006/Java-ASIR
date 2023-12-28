package racional;
import java.util.Scanner;

import java.util.ArrayList;

public class usoRacional {

	public static void main(String[] args) {
		/*Racional a = new Racional(4,2);
		Racional b = new Racional(1,3);
		Racional c = new Racional();
	
		System.out.println(a);
		System.out.println("-----------------");
		System.out.println(b);
		System.out.println("-----------------");
		System.out.println(c);
		System.out.println("-----------------");
		System.out.println("Sumar");
		System.out.println(a.suma(b));
		System.out.println("-----------------");
		System.out.println("Restar");
		System.out.println(a.resta(b));
		System.out.println("-----------------");
		System.out.println("Multiplicar");
		System.out.println(a.multiplica(b));
		System.out.println("-----------------");
		System.out.println("Dividir");
		System.out.println(a.division(b));*/
		
		//CREAR MATRIZ CON DIEZ RACIONALES ALEATORIOS 
		/*
		Racional[] a=new Racional[10];
		
		for (int i = 0; i < a.length; i++) {
			int num= (int) (Math.random()*100+1);
			int dem= (int) (Math.random()*100+1);
			a[i]= new Racional(num,dem);
			System.out.println(a[i]);
		}
		
		//crear matriz 2 con racionales
		Racional[] b=new Racional[10];
		
		
		for (int i = 0; i < b.length; i++) {
			int num= (int) (Math.random()*100+1);
			int dem= (int) (Math.random()*100+1);
			b[i]= new Racional(num,dem);
			System.out.println(b[i]);
		}
		
		Racional acumulaSuma=new Racional(0,1);
		Racional acumulaMulti=new Racional(1,1);

		//SUMA DE TODAS LOS RACIOANALES DE A
		for (int i = 0; i < a.length; i++) {
		acumulaSuma.suma(a[i]);	
		acumulaMulti.suma(a[i]);	
		
		System.out.println("suma de a: "+acumulaSuma);
		
		}
		
		for (Racional racional : b) {
			System.out.println(racional);
		}
		*/
		
		
		//CREAR UN ARRRAY LIST DE RACIONALES Y METEREMOS 20 NUMEROS REACIONALES ALEATORIOS
		ArrayList<Racional> listaRacionales = new ArrayList<Racional>(20);
		
		//mete denrtro de la lista de racionales 20 racionales aleatorios (esta funcion es un metodo ya creado en racionales)
		for (int i=0; i<20; i++) {
			listaRacionales.add(Racional.racionalAleatorio());
		}
		
		System.out.println("Tamaño del arrayList: "+listaRacionales.size());
		for (Racional racional : listaRacionales) {
			System.out.println(racional);
		}
		
		//meter racional y mirar si esta en la matriz
		
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el numerador:");
		int num =teclado.nextInt();
        System.out.print("Introduce el denominador:");
		int dem =teclado.nextInt();
		
		//crea un objeto racional con los dos numeros introducidos
		Racional introducido = new Racional(num,dem);
		//Busca  en la lista de racionales si esta lo introducido
		int pos=listaRacionales.indexOf(introducido);
		
		if (pos==-1) {
			System.out.println("No esta dentro de la lista");
		} else {
			System.out.println("Esta dentro de la lista");
		}
		
		
		
	}

	
}
