package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Pirata {
	private String llave;
	private String palabra;
	private String Apellido1;
	private String Apellido2;
	//OJO: AQU� SE PERDI� LA DECLARACI�N DE UN ATRIBUTO
	private Properties codigohonor;
	private Properties honor;

	public Pirata() {
		this.llave = "xxx";
		this.palabra = "yes";
		this.codigohonor = new Properties();
		this.honor= new Properties();
	}

	public void establecerLlaves(String cofrecerrado) {
		codigohonor.setProperty("hermandad", "barbosa");
		codigohonor.setProperty("enemistad", "salazar");
		try {
			codigohonor.store(new FileOutputStream(cofrecerrado), null);
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
			this.Apellido1=honor.getProperty("barbosa");
			this.Apellido2=honor.getProperty("salazar");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return this.llave + " ** " + this.palabra +  this.Apellido1+" ** "+this.Apellido2+" ** ";
	}
	
}
