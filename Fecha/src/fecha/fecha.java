package fecha;

public class fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	//constructor    
	public fecha() {
		super();
	}
	
	public fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	//GENERAR STRING 
	@Override
	public String toString() {
		return String.format("Dia %d del mes %d del a�o %d ",dia,mes,a�o);
	}
	
	//METODOS
	public void comprobar_mes() {
		if (mes>12 || mes <1) {
			setMes(1);
		}
	}
	
	public void comprobar_dias() {
		if (dia>mesesDias()) {
			setDia(1);
		}
	}
	
	public int mesesDias() {
		switch (mes) {
		case 2: 
			return 28;
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0;
	}
		
}


