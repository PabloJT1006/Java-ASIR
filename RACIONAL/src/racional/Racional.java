package racional;

import java.util.Objects;

//CREAR MATRIZ CON DIEZ RACIONALES ALEATORIOS 
public class Racional {
	private int numerador;
	private int denominador;
	
	
	
	public Racional() {
		super();
		this.numerador=numerador/maximoComunDivisor(numerador,denominador);
		this.denominador=denominador/maximoComunDivisor(numerador, denominador);
	}

	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	@Override
	public String toString() {
		return  numerador + "/" + denominador;
	}
	
	public static int minimo_comun_divisor(int numero1, int numero2){
        if (numero2==0) return numero1;
        else{
            return minimo_comun_divisor(numero2, numero1%numero2);
        }
    }
	private int maximoComunDivisor(int a, int b) {
	    int temporal; 
	    while (b != 0) {
	        temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    return a;
	}
	
	public Racional suma(Racional r) {
		int num = this.numerador*r.denominador+r.numerador*this.denominador;
		int den = this.denominador*r.denominador;
		return new Racional (num,den);
	}
	
	 public Racional resta(Racional r) {
	        int num = (this.numerador*r.denominador)-(r.numerador*this.denominador);
	        int denominador = this.denominador*r.denominador;
	        return new Racional(num, denominador);
	    }
	    
	 public Racional multiplica(Racional r) {
	        return new Racional(this.numerador*r.numerador, this.denominador*r.denominador);
	    }
	    
	 public Racional division(Racional r) {
	        return new Racional(this.numerador*r.denominador, this.denominador*r.numerador);
	    }
	 
	 //crea un numero raicional aleatorio
	 public static Racional racionalAleatorio() {
		 int num= (int) (Math.random()*100+1);
		 int dem= (int) (Math.random()*100+1);
		 
		 return new Racional(num,dem);
	 }

	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racional other = (Racional) obj;
		return denominador == other.denominador && numerador == other.numerador;
	}
	 
	 
	
	
	
}
