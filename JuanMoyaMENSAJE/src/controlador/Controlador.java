package controlador;
import modelo.*;
import vista.*;
public class Controlador {
	
		private Mundo bd;
		private Interfaz gui;
	
		public Controlador() 
		{
			//OJO: AQUI VA UNA LINEA DE CÓDIGO QUE SE PERDIÓ!!!!!
			
			bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
			gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
		}	
	
}
