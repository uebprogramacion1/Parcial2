package modelo;

import javax.swing.JOptionPane;

public class Contador {
    char[] obtener;
    char[] dar;
    private int intentos;
	private String palabra;
	public Contador() {
		palabra= "clase";
		obtener = new char[5];
		dar = new char[5];
		obtener[0]=palabra.charAt(0);
		obtener[1]=palabra.charAt(1);
		obtener[2]=palabra.charAt(2);
		obtener[3]=palabra.charAt(3);
		obtener[4]=palabra.charAt(4);
		}
	
	public int contarLetras() {

		intentos=0;
			while(dar[0]==obtener[0]&&dar[1]==obtener[1]&&dar[2]==obtener[2]&&dar[3]==obtener[3]&&dar[4]==obtener[4]) {
				String c=JOptionPane.showInputDialog("Ingrese letra: ");
				for(int i =0;i<obtener.length;i++) {
					if(obtener[i]==c.charAt(0)) {
						dar[i]=c.charAt(0);
					}
				}
				intentos++;
			}
		
		return intentos;
	}
	
}
	
