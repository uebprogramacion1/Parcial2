package Contador;

import javax.swing.JOptionPane;

public class ContarLetras {

	public static void main(String[] args) {
		
		String letras = "";
		boolean b = false;
		int van = 0;
		int condicion = 0;
		int c,l,a,s,e;
		c=l=a=s=e=0;
		
		while(b==false) {
			
			letras = JOptionPane.showInputDialog(null, "Ingrese el caracter");
			
			if(letras.equals("c")) {
				if(letras.equals("c") && c==0) c++;
				condicion++;
			}else if(letras.equals("l")) {
				if(letras.equals("l") && l==0) l++;
				condicion++;
			}else if(letras.equals("a")) {
				if(letras.equals("a") && a==0) a++;
				condicion++;
			}else if(letras.equals("s")) {
				if(letras.equals("s") && s==0) s++;
				condicion++;
			}else if(letras.equals("e")) {
				if(letras.equals("e") && e==0) e++;
				condicion++;
			}
			
			van++;
			
			if(condicion == 5) {
				b = true;
			}
		}
			van -= 1;
			JOptionPane.showMessageDialog(null, "Se leyeron " + van + " Caracteres antes ");
	}
}
