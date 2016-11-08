//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917


package concursantes;

import org.springframework.stereotype.Component;

@Component("solei")
public class Malabarista implements Concursante {
	private int pelotas = 10;

	public Malabarista() {
	}

	public Malabarista(int pelotas) {
		this.pelotas = pelotas;
	}

	public void ejecutar() throws EjecucionException {
		System.out.println("Malabareo " + pelotas + " pelotas");
	}

	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}
}