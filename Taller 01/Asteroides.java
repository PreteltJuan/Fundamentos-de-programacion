import java.util.Scanner;

public class Asteroides
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int numero_asteroides = in.nextInt();
		in.nextLine();
		String nombre_asteroides = in.nextLine();

		System.out.print("Los " + numero_asteroides + " asteroides " + nombre_asteroides + " caen del cielo");
	}
}