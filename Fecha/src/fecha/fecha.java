package fecha;

public class fecha {
	private int dia;
	private int mes;
	private int año;
	
	//constructor    
	public fecha() {
		super();
	}
	
	public fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	//GENERAR STRING 
	@Override
	public String toString() {
		return String.format("Dia %d del mes %d del año %d ",dia,mes,año);
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


