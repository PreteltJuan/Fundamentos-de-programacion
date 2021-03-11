import java.util.Scanner;

public class Fahrenheit
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		float gradosCelsius = in.nextFloat();

		System.out.print( String.format("%.2f", (gradosCelsius / 5 * 9 + 32)));
	}
}