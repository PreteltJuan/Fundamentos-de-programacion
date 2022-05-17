package TalleresJava.Taller03;

import java.util.Scanner;

public class Helado
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int temperaturaActual = in.nextInt();
		int edadUsuario = in.nextInt();
		
		if( temperaturaActual > 27 && edadUsuario >= 18 )
		{
				System.out.print("Comprar helado cerveza");
		}
		else
		{
				System.out.print("Lo sentimos juventud");		
		}
		
		in.close();
	}
}