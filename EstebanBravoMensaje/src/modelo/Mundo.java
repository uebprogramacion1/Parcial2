package modelo;


public class Mundo 
{
	
	private Persistencia BD;
	private Pirata Sparrow;
	public Mundo() {
		BD = new Persistencia();
		Sparrow = new Pirata();
	}
	
	public Pirata getSparrow() 
	{
		return Sparrow;
	}


	public Persistencia getBD() 
	{
		return BD;
	}

}
