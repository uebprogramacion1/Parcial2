package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirDato(String recibirLlaves) {
		JOptionPane.showConfirmDialog(null, recibirLlaves);
		System.out.println(recibirLlaves);
	}

}
