package Talleres.Taller03;

public class Discoteca
{
	public boolean accesoDiscoteca(int edad, int dinero, String nombre)
	{
		if(edad >= 18 && dinero >= 100 && !nombre.equalsIgnoreCase("jimmy"))
		    return true;
		else
		    return false;

	}
}