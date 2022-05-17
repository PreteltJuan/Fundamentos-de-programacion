package TalleresJava.Taller01;

import java.util.Scanner;


public class Radio
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		Double radio = in.nextDouble();
		
		System.out.print( String.format("%.2f", Math.pow(radio, 2) * Math.PI));
		in.close();
	}
}