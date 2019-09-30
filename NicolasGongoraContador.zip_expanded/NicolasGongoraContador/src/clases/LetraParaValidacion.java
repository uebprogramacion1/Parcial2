package clases;

public class LetraParaValidacion {

	private boolean haSidoValidada;
	private char letra;

	public LetraParaValidacion(char letra) {
		this.letra = letra;
		haSidoValidada = false;
	}

	public void setEstadoDeValidacion(boolean estado) {
		this.haSidoValidada = estado;
	}

	public boolean getEstadoDeValidacion() {
		return this.haSidoValidada;
	}

	public char letra() {
		return this.letra;
	}

}
