	package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
		private Mundo bd;
		private Interfaz gui;
	
		public Controlador() 
		{
			//OJO: AQUI VA UNA LINEA DE C�DIGO QUE SE PERDI�!!!!!
			//OJO: AQUI VA UNA LINEA DE C�DIGO QUE SE PERDI�!!!!!
			
			bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico());
			bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
			gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
			gui.escribirDato(bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico()));
		}	
	}

