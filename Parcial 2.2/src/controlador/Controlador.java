package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

		private Mundo bd;
		private Interfaz gui;
	
		public Controlador() 
		{
			bd.setCofremagico("PalabraSecreta");
			
			
			bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
			gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
		}	
	}

