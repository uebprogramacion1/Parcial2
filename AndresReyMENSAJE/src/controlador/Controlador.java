package controlador;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador {
	private Mundo bd;
	private InterfazGUI gui;

	public Controlador() 
	{
		bd = new Mundo ();
		gui = new InterfazGUI();
		bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
		gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
	}
}
