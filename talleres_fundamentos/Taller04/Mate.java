package TalleresJava.Taller04;

public class Mate
{
	public int factorial(int num)
	{
		int total = 1;

		for(int i = num; i > 0; i--)
		{
			total *= i;	
		}
		
		return total;
	}
}