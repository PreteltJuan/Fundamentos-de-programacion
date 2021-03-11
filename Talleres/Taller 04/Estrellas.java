import java.util.Scanner;


public class Estrellas
{
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		
		int estrellas = 0;

		int totalCero = 0;
		int totalUna = 0; 
		int totalDos = 0;
		int totalTres = 0;
		int totalCuatro = 0;
		int totalCinco= 0;
		
		while(estrellas != -1)
		{
			estrellas = in.nextInt();
			switch(estrellas)
			{
				case 0:
					totalCero++;
					break;
				case 1:
					totalUna++;
					break;
 				case 2: 
					totalDos++;
					break;
				case 3:
					totalTres++;
					break;
				case 4:
					totalCuatro++;
					break;
				case 5:
					totalCinco++;
					break;
			}
		}

		System.out.println( "0(" + totalCero + ") *(" + totalUna + ") **(" + totalDos +") ***(" + totalTres + ") ****(" + totalCuatro + ") *****(" + totalCinco +")" );
		System.out.print("Total: " + (totalCero + totalUna + totalDos + totalTres + totalCuatro + totalCinco));
	}
}