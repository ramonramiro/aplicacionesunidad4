//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Voluntario implements Pensador {
	private String pensamientos;

	public void pensarEnAlgo(String pensamientos) {
		System.out.println("Ejecutando método pensar en Algo");
		this.pensamientos = pensamientos;
	}

	public String getPensamientos() {
		return this.pensamientos;
	}
}