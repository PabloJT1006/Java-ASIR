package reloj;

public class Reloj {
	private int hora;
	private int minuto;
	private int segundos;
	
	//CONSTRUCTORES
	public Reloj() {
		super();
	}

	public Reloj(int hora, int minuto, int segundos) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return String.format(" %d:%d:%d ",hora,minuto,segundos);
	}
	
	public String formato12() {
		if (this.hora < 13) {
			return String.format("%02d:%02d:%02d am" , hora, minuto, segundos);
		}
		else return String.format("%02d:%02d:%02d pm" , hora-12, minuto, segundos);
	}
	
	public void relojhora() {
        int cont=0;
        while (this.segundos>59) {
            this.segundos-=60;
            cont++;
        }

        this.minuto+=cont;
        cont=0;
        while (this.minuto>59) {
            this.minuto-=60;
            cont++;
        }

        this.hora+=cont;

        while (this.hora>23) {
            this.hora-=24;
        }
    
	
	}

}



