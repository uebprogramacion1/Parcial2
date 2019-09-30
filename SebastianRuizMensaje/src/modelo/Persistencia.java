package modelo;

public class Persistencia {
	
	private String cofremagico;

	public Persistencia() {
		
		this.setCofremagico("codigopirata.properties");
	}

	public String getCofremagico() {
		return cofremagico;
	}

	public void setCofremagico(String cofremagico) {
		this.cofremagico = cofremagico;
	}
}
