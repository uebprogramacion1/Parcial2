package controlador;
import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador {
	private Mundo bd;	
	private InterfazGUI gui;
	
	public Controlador() {
	bd = new Mundo();
	gui = new InterfazGUI();
	
	
	String palabra = null;
	String llave = null;
	
	
	//gui.verificarMensaje(bd.getSparrow(llave,palabra));
	bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
	bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico());
	gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
	
	}
	
	
	}

