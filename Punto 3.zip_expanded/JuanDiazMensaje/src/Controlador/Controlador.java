package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	private Mundo bd;
	private Interfaz gui;

	public Controlador() 
	{
		//OJO: AQUI VA UNA LINEA DE C�DIGO QUE SE PERDI�!!!!!
		bd = new Mundo();
		//OJO: AQUI VA UNA LINEA DE C�DIGO QUE SE PERDI�!!!!!
		gui = new Interfaz();
		
		
		bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
		gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
	}	
}