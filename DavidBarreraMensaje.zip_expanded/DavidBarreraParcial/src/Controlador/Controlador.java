package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	private Mundo bd;
	private Interfaz gui;
	

	public Controlador() {
		bd = new Mundo();
		gui = new Interfaz();
		{
			// OJO: AQUI VA UNA LINEA DE CÓDIGO QUE SE PERDIÓ!!!!!
			// OJO: AQUI VA UNA LINEA DE CÓDIGO QUE SE PERDIÓ!!!!!
			
			bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico());
			bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
		
			gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
			
		}
	}
}

/*
 * en Clase Interfaz va todo completo como lo tengas tu de tus proyectos
 * anteriores
 */
