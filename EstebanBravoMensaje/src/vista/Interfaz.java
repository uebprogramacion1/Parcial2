package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interfaz extends JFrame
{
	
	public Interfaz()
	{
		
	}

	public void escribirDato(String recibirLlaves) 
	{
		JOptionPane.showMessageDialog(this, "Las llave son: " + recibirLlaves);
	}

}
