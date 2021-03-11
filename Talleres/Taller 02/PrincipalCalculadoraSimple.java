import java.util.Scanner;

public class PrincipalCalculadoraSimple
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		CalculadoraSimple cS = new CalculadoraSimple();
		
		int[] numeros = new int[2];
		numeros[0] = in.nextInt();		
		numeros[1] = in.nextInt();
	
		System.err.println(cS.sumar(numeros[0],numeros[1]));
		System.err.println(cS.restar(numeros[0],numeros[1]));
	}
}