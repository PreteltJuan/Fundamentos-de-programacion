package Talleres.Taller02;

public class Jugador
{
	private String nombre;
	private int salud;
	
	Jugador(int salud, String nombre)
	{
		this.nombre = nombre;
		this.salud = salud;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
		
	public void setSalud(int salud)
	{
		this.salud = salud;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getSalud()
	{
		return salud;
	}

	public void reducirSalud(int salud)
	{
		this.salud -= salud;
	}
}