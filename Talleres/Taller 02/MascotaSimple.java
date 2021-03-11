public class MascotaSimple
{
	private int edad;
	private String nombre;
	
	MascotaSimple()
	{
		edad = 8;
		nombre = "Kitty";
	}
	
	MascotaSimple(String nombre)
	{
		edad = 8;
		this.nombre = nombre;
	}
	
	MascotaSimple( String nombre, int edad)
	{
		this.edad = edad;
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}
		
	public int getEdad()
	{
		return edad; 
	}
}