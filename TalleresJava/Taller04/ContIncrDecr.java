package TalleresJava.Taller04;

import java.util.Scanner;

public class ContIncrDecr
{
	public static void main(String ar[])
	{
		Scanner in = new Scanner(System.in);
	
	
		int n = in.nextInt();
		int numero;
		int acumulador = 0;
	
	
		while(n > 0)
		{
			numero = in.nextInt();
			if(numero%2 == 0)
			{
				acumulador += numero;
			}
			n--;
		}
		
		
		
		System.out.println(acumulador);
		in.close();				
	}
}