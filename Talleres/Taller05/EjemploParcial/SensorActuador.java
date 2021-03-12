package Talleres.Taller05.EjemploParcial;

public class SensorActuador
{
	private int temperatura;
	private int minTemp;
	private int maxTemp;

	SensorActuador(int tempActual, int minTemp, int maxTemp)
	{
		this.temperatura = tempActual;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		
	}

	public int getTemperatura()
	{
		return temperatura;
	}

	public void disminuirTemp( int i)
	{
		int resta = temperatura - i;

		if(resta >= minTemp)temperatura = resta;
		
	}

	public void aumentarTemp( int i)
	{
		int suma = temperatura + i;

		if(suma <= maxTemp) temperatura = suma;
	}
}