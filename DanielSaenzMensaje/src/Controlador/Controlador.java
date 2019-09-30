package Controlador;
import Modelo.Mundo;
import Vista.Interfaz;
public class Controlador {
	private Mundo bd;
	private Interfaz gui;

	public Controlador() 
	{
		bd = new Mundo();
		//OJO: AQUI VA UNA LINEA DE CÓDIGO QUE SE PERDIÓ!!!!!
		gui = new Interfaz();
		//OJO: AQUI VA UNA LINEA DE CÓDIGO QUE SE PERDIÓ!!!!!
		bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
		gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
	}	
}
