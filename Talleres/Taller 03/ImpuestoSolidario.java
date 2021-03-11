import java.util.Scanner;

public class ImpuestoSolidario
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		double salario = in.nextDouble();
		String tipoContrato = in.next();
 	
		
		if( tipoContrato.equalsIgnoreCase("publico") && salario > 10000000 )
		{
			System.out.println(String.format("%.2f", (salario * 0.15) ));
		}
		else
		{
			System.out.println("No debes aportar");	
		}
		
	}
}