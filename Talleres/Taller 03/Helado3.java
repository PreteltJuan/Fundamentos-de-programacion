import java.util.Scanner;

public class Helado3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		int temperaturaActual, edadUsuario, dineroUsuario;

		temperaturaActual = in.nextInt();
		edadUsuario = in.nextInt();
 
		
		if( temperaturaActual > 27 && edadUsuario >= 18 )
		{
				dineroUsuario = in.nextInt();
				if(dineroUsuario > 5000)
				{
					System.out.print("Comprar helado cerveza");	
				}
				else
				{
					System.out.print("De que me hablas viejo");		
				}
		}
		else
		{
				System.out.print("Lo sentimos juventud");		
		}
		
	}
}