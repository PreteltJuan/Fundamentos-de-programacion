package TalleresJava.Taller01;

import java.util.Scanner;

public class Mayores
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println((num1 + num2) + "\n" + (num1 * num2) );
		in.close();
	}
}