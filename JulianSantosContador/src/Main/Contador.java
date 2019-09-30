package Main;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
        String x;
        int contador=0;
        boolean c=false,l=false,a=false,s=false,e=false;
        x="";
        while (!c || !l || !a || !s || !e){
            System.out.println("Escriba el caracter a evaluar: ");
            x = new Scanner(System.in).next();
            if (x.equals("c")) c=true;
            if (x.equals("l")) l=true;
            if (x.equals("a")) a=true;
            if (x.equals("s")) s=true;
            if (x.equals("e")) e=true;
            contador++;
        }
        System.out.println("El total de caracteres es: "+contador);
    }
}




