package modelo;

public class Mundo {
	private Persistencia BD;
	private Pirata Sparrow;
	private String cofremagico;
	public Mundo() {
			BD = new Persistencia();
			Sparrow = new Pirata();
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


		public void Persistencia() {
			this.cofremagico = "codigopirata.properties";
		}
		

}
