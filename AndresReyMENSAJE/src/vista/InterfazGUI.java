package vista;

import javax.swing.JOptionPane;

import controlador.Controlador;
public class InterfazGUI  {
	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null,
				dato,
				"Mensaje secreto",
				JOptionPane.INFORMATION_MESSAGE);
	}
}


