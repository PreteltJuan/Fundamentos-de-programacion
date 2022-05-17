package TalleresJava.Taller04;

import java.util.Scanner;

public class Multiplos5
{
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		
		int valorUsuario = in.nextInt();
		
		for(int i = 5; i <= valorUsuario; i++)
		{
			if(i%5 == 0)
			{
				System.out.println(i);
			}	
		}

		in.close();
	}
}