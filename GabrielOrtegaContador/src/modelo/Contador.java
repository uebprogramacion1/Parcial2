package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Contador {
	private char[] comparar;
	private String escribir;
	private String clase;
	private char[] leido;
	public Contador() {
		escribir = "clase";
	}

	public void contarLetras() {
		int contador = 0;
		comparar = escribir.toCharArray();
		leido = escribir.toCharArray();
		for (int i = 0; i < comparar.length; i++) {
			for (int j = 0; j < leido.length; j++) {
				
		while(comparar[i]!=leido[j]) {
			escribir = JOptionPane.showInputDialog("ingrese letra");
			comparar = escribir.toCharArray();
			contador++;
		}
		}
		}
	JOptionPane.showMessageDialog(null, "ha ganado en "+contador);

		
	}
}
