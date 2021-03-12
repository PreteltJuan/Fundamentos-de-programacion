package Talleres.Taller01;

import java.util.Scanner;

public class Hipotenusa
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		Double catetoA = in.nextDouble();
		Double catetoB = in.nextDouble();

		System.out.print( String.format("%.2f", Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2))));
		in.close();
	}
}