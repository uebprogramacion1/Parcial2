package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() {
		
	}

	public String pedirDato() {
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
