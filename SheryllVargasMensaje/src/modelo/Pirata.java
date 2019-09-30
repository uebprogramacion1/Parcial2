package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Pirata {
	private String llave;
	private String palabra;
	//OJO: AQU� SE PERDI� LA DECLARACI�N DE UN ATRIBUTO
	private Properties codigohonor;

	public Pirata() {
		this.llave = "xxx";
		this.palabra = "yes";
		this.codigohonor = new Properties();
	}

	public void establecerLlaves(String cofrecerrado) {
		codigohonor.setProperty("hermandad", "barbosa");
		codigohonor.setProperty("enemistad", "salazar");
		try {
			codigohonor.store(new FileOutputStream(cofrecerrado), null);
			JOptionPane.showMessageDialog(null, cofrecerrado);
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	public String recibirLlaves(String cofreabierto) {
		try {
			codigohonor.load(new FileInputStream(cofreabierto));
			this.llave = codigohonor.getProperty("hermandad");
			this.palabra = codigohonor.getProperty("enemistad");
			JOptionPane.showMessageDialog(null, cofreabierto);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return this.llave + " ** " + this.palabra;
	}
}	


