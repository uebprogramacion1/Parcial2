package modelo;
public class Persistencia {

	private String cofremagico;

	public String getCofremagico() {
		return cofremagico;
	}

	public void setCofremagico(String cofremagico) {
		this.cofremagico = cofremagico;
	}

	public Persistencia() {
		this.cofremagico = "codigopirata.properties";
	}

}
