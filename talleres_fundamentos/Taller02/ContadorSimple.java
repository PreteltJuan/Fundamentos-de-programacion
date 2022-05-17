package TalleresJava.Taller02;



public class ContadorSimple
{
	private int conteo;
	
	ContadorSimple()
	{
	 	conteo = 1;
	}

	public void aumentar()
	{
		conteo++;
	}
	
	public void disminuir()
	{
		conteo--;
	}
	
	public int getConteo()
	{
		return conteo;	
	}
	
	
}