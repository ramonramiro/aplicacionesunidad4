//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package concursantes;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Mago implements Adivinador {
	private String pensamientos;

	@Pointcut("execution(* concursantes.Pensador.pensarEnAlgo(String)) && args(pensamientos)")
	public void pensar(String pensamientos) {
	}

	@Before("pensar(pensamientos)")
	public void interceptarPensamientos(String pensamientos) {
		System.out.println("Magia....");
		System.out.println("Estos son los pensamientos del voluntario: "
				+ pensamientos);
		this.pensamientos = pensamientos;
	}

	public String getPensamientos() {
		return this.pensamientos;
	}
}