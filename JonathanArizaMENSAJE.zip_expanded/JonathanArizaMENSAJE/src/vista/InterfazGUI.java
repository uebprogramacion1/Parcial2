package vista;

import javax.swing.JOptionPane;
	
public class InterfazGUI {
	String mensajeSecreto;
	
	public String verificarMensaje(){
		mensajeSecreto=JOptionPane.showInputDialog("Escriba el c�digo secreto");
		return mensajeSecreto;
	}
	public String escribirDato(String recibirLlaves) {
		JOptionPane.showMessageDialog(null, recibirLlaves);;
		return null;
		
	}
			
}
