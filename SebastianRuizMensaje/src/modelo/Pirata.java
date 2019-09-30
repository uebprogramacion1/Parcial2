package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Pirata {
		private String llave;
		private String palabra;
		private Properties codigohonor;
		
		//OJO: AQU� SE PERDI� LA DECLARACI�N DE UN ATRIBUTO
	
		public Pirata() {
			this.llave = "xxx";
			this.palabra = "yes";
			this.codigohonor = new Properties();
		}
	
		public String establecerLlaves(String cofrecerrado) {
			codigohonor.setProperty("hermandad", "barbosa");
			codigohonor.setProperty("enemistad", "salazar");
			try {
				codigohonor.store(new FileOutputStream(cofrecerrado), null);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return "barbosa,salazar;";
		}

		public String recibirLlaves(String cofreabierto) {
			try {
				codigohonor.load(new FileInputStream(cofreabierto));
				this.llave = codigohonor.getProperty("hermandad");
				this.palabra = codigohonor.getProperty("enemistad");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return this.llave + " ** " + this.palabra;
		}
	}	
