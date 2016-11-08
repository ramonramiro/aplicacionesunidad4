//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrumento {
	public void tocar() {
		System.out.println("Clin clin clin clin...");
	}
}