package Talleres.Taller05;

import java.util.Scanner;

public class Infinito
{
	public static void main(String a[])
	{
		
		Scanner in = new Scanner(System.in);
		String resultados = "";

		while(true)
		{
			int var = in.nextInt();
			if(var == 0) break;
			resultados += var * 3 + "\n";
		}

		System.out.print(resultados);
		in.close();
	}
}