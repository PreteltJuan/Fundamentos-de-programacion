import java.util.Scanner;

public class PrincipalJugador
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int salud = in.nextInt();
		String nombre = in.next();
		
		Jugador jugador = new Jugador(salud, nombre);
		
		jugador.reducirSalud(in.nextInt());
		jugador.reducirSalud(in.nextInt());
		System.err.print(jugador.getNombre() + jugador.getSalud());
	}
}