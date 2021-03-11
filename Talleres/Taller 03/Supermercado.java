import java.util.Scanner;

public class Supermercado
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int tipoProductosComprados, cantidadProductosComprados, puntosObtenidos;

		
		tipoProductosComprados = in.nextInt();
		cantidadProductosComprados = in.nextInt();
 	
		
		switch( tipoProductosComprados )
		{
			case 1:
				puntosObtenidos = cantidadProductosComprados * 5;
				break;

			case 2:
				puntosObtenidos = cantidadProductosComprados * 10;
				break;
	
			case 3:
				puntosObtenidos = cantidadProductosComprados * 15;
				break;
	
			default:
				puntosObtenidos = 0;
	
		}

		System.out.println(puntosObtenidos);

		
	}
}