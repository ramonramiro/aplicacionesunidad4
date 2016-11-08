//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import concursantes.Concursante;

public class PruebaConcursoTalento {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Concursante malabarista1 = (Concursante) ctx.getBean("solei");
		malabarista1.ejecutar();
	}
}