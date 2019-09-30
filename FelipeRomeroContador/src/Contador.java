import java.util.Scanner;

public class Contador {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese mensaje");
		String cadena=sc.nextLine();

		char[] arrayChar = cadena.toCharArray();

		for(int i=0; i<arrayChar.length; i++){

			if( arrayChar[i] == 'c' )
				System.out.println( arrayChar[i] + " -> es letra c");
			else
				if( arrayChar[i] == 'l' )
					System.out.println( arrayChar[i] + " -> es letra l");
				else
					if( arrayChar[i] == 'a' )
						System.out.println( arrayChar[i] + " -> es letra a");
					else
						if( arrayChar[i] == 's' )
							System.out.println( arrayChar[i] + " -> es letra s");
						else
							if( arrayChar[i] == 'e' )
								System.out.println( arrayChar[i] + " -> es letra e");


		}
	}
}	