package clases;

import java.util.ArrayList;

public class Contador {

	private int contadorDeIntentos;
	private ArrayList<LetraParaValidacion> miPalabraClase;

	public Contador() {
		contadorDeIntentos = 0;
		miPalabraClase = new ArrayList<LetraParaValidacion>();

		miPalabraClase.add(new LetraParaValidacion('c'));
		miPalabraClase.add(new LetraParaValidacion('l'));
		miPalabraClase.add(new LetraParaValidacion('a'));
		miPalabraClase.add(new LetraParaValidacion('s'));
		miPalabraClase.add(new LetraParaValidacion('e'));
	}

	public void agregarIntento(char letra) {
		for (int i = 0; i < miPalabraClase.size(); i++) {
			if (miPalabraClase.get(i).letra() == letra && miPalabraClase.get(i).getEstadoDeValidacion() == false) {
				miPalabraClase.get(i).setEstadoDeValidacion(true);
				break;
			}
		}
		contadorDeIntentos++;
	}

	public boolean verificarCompletamiento() {
		boolean resultado = true;
		for (int i = 0; i < miPalabraClase.size(); i++) {
			if (miPalabraClase.get(i).getEstadoDeValidacion() == false) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}

	public int getContadorDeIntentos() {
		return this.contadorDeIntentos;
	}

	public void contarLetras() {
		//Hola. Soy un método que no hace nada. ¿Cómo se supone que me involucre en el programa? ...
	}
}
