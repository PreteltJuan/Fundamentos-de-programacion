package TalleresJava.Taller03;

import java.util.Scanner;

public class ParImpar
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		int numero = in.nextInt();
 
		
		if( numero%2 == 0 )
		{
			System.out.println("Es par");
		}
		else
		{
			System.out.println("Es impar");	
		}
		
		in.close();
	}
}