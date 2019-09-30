package clases;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String lecturaPorConsola;
		boolean seguirIntentando = true;

		Contador miContador = new Contador();

		while (seguirIntentando) {

			System.out.println("Digite un caracter para intentar: ");
			lecturaPorConsola = in.nextLine();
			try {
				miContador.agregarIntento(lecturaPorConsola.charAt(0));
				if (miContador.verificarCompletamiento() == true) {
					System.out.println(
							"Ha completado la palabra clase en " + miContador.getContadorDeIntentos() + " intentos... ¡Bien hecho!");
					seguirIntentando = false;
				}
			} catch (Exception ex) {
				System.out.println("El caracter no puede estar vacío. Intente de nuevo...");
			}
		}
	}

}
