package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirDato(String recibirLlaves) {
		JOptionPane.showMessageDialog(null, recibirLlaves, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
}
