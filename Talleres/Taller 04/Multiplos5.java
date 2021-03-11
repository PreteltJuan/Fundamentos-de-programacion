
public class Mate
{
	public int factorial(int num)
	{
		int total = 0;

		for(int i = num; i > 0; i--)
		{
			total *= i;	
		}
		
		return total;
	}
}