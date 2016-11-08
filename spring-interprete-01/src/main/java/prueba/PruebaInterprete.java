//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package prueba;

import beans.InterpreteEspanol;
import beans.Traductor;

public class PruebaInterprete {
	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		// El interprete se inyecta manualmente //Y solamente puede recibir un
		// interprete en Español //No un interprete en Inglés u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("Ramiro Soto");
		traductor.hablar();
	}
}