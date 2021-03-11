import java.util.Scanner;

public class Conteo100
{
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		
		int contadora = 0;
		int numero = 0;
		
		
		while(true)
		{
			numero = in.nextInt();
			if(numero > 100) contadora++;
			else if(numero == 0)
			{
				System.out.println(contadora);
				break;
			}	
		}
	}
}