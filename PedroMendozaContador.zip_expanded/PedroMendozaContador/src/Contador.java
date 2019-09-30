import javax.swing.JOptionPane;

public class Contador 
{
	public Contador()
	{
		contarLetras();
	}
	
	public void contarLetras()
	{
		boolean con=false;
		char[] cl=new char[5];
		for(int c=0;c<5;c++)
		{
			cl[c]= 'b';
		}
		int cont = 0;
		while(con == false)
		{
		String car;
		car = JOptionPane.showInputDialog("digite el caracter");
		if(car.length() > 1)
		{
			JOptionPane.showMessageDialog(null, "debe digitar un caracter nada mas");
		}
		else
		{		
			if(car.charAt(0) == 'c')
			{
				cl[0]= 'c';
			}
			else if (car.charAt(0) == 'l')
			{
				cl[1]= 'l';
			}
			else if (car.charAt(0) == 'a')
			{
				cl[2]= 'a';
			}
			else if (car.charAt(0) == 's')
			{
				cl[3]= 's';
			}
			else if (car.charAt(0) == 'e')
			{
				cl[4]= 'e';
			}
			cont++;
		}
		if(cl[0] == 'c' && cl[1] == 'l' && cl[2] == 'a' && cl[3] == 's' && cl[4] == 'e')
		{
			con = true;
		}
		}
		
		JOptionPane.showMessageDialog(null, "ha completado la palabra clase, numero de intentos: "+cont);
	}
}
