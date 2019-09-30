package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		
	}
	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Mensaje Secreto", JOptionPane.INFORMATION_MESSAGE);
	}
}
