package controlador;

import vista.Interfaz;
import modelo.Mundo;

public class Controlador {
	private Mundo bd;
	private Interfaz gui;
	
	public Controlador() 
		{
			gui = new Interfaz();
			bd = new Mundo();
			bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
			gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
		}			
}

