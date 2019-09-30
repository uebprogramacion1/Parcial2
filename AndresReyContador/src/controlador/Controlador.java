package controlador;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador {
private Mundo m;
private InterfazGUI gui;
public Controlador() {
	m = new Mundo();
	gui = new InterfazGUI ();
	gui.mostrarMensaje(m.getCon().contarLetras());
	

}
}
