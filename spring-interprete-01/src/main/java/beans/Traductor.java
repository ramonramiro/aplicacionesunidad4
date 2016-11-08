//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO 
//TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION 
//SISTEMAS INFORMATICOS 
//RAMON SOTO RINCON
//GSI-1241
//1215100917

package beans;

public class Traductor {
	private Interprete interprete;
	private String nombre;

	public void hablar() {
		this.interprete.saludar();
		System.out.println(nombre);
		this.interprete.despedirse();
	}

	public Interprete getInterprete() {
		return interprete;
	}

	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}