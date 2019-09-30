package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato, "Mostrar Dato", JOptionPane.INFORMATION_MESSAGE);
	}
}