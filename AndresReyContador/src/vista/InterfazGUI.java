package vista;

import javax.swing.JOptionPane;

public class InterfazGUI {


	public void mostrarMensaje(int i) {
		JOptionPane.showMessageDialog(null,
				i,
				"Intentos",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
}
