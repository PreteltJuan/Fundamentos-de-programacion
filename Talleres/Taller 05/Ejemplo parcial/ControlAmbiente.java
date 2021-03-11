import java.util.Scanner;

public class ControlAmbiente
{
	public static void main(String a[])
	{
		SensorActuador sensorActuador = new SensorActuador(5,1,10);
		Scanner in = new Scanner(System.in);
	
		
		int numero = in.nextInt();

		for( int i = 0; i < 4; i++)
		{
			if(i < 2)
			{
				sensorActuador.disminuirTemp(numero);
			}
			else
			{	
				sensorActuador.aumentarTemp(numero);
			}
		}

		System.out.println(sensorActuador.getTemperatura());
	}
}
