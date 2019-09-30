package modelo;
public class Mundo {

	Persistencia BD;
	private Pirata Sparrow;
	private String dato; 
	
	public Mundo() {
		BD = new Persistencia();
		Sparrow = new Pirata();
		
		dato = "";
	}

	public String getDato() {
		return dato;
	}


	public void setDato(String dato) {
		this.dato = dato;
	}

	
	public void procesarDato() {
		this.dato = this.dato + " procesado";
	}

	public Persistencia getBD() {
		return BD;
	}

	public void setBD(Persistencia bD) {
		BD = bD;
	}

	public Pirata getSparrow() {
		return Sparrow;
	}

	public void setSparrow(Pirata sparrow) {
		Sparrow = sparrow;
	}
	
}
