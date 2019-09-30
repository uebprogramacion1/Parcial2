package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	
	public Interfaz() {
		
	}
	
	public String escribirDato(String recibirLlaves, String establecerLlaves ) {
		JOptionPane.showInputDialog("CLAVE");
		JOptionPane.showMessageDialog(null, recibirLlaves, "Recibir Llaves", 0);
		JOptionPane.showMessageDialog(null, establecerLlaves, "Establecer Llaves", 0);
		return null;
		
	}

}
