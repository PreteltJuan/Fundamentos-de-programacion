import java.util.Scanner;

public class Mesada
{
	public static void main(String a[])
	{
		
		Scanner in = new Scanner(System.in);
		String nombrePersona = in.next();

		while(true)
		{
			int cantDinero = in.nextInt();
			if(cantDinero  > 500) 
			{
				System.out.println(nombrePersona + " eres mi angel");
				break;
			}
			System.out.println(nombrePersona + " me decepcionas");
			
		}

		

	}
}