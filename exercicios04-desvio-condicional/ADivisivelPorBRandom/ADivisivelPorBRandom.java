//daniela de toledo rosario

public class ADivisivelPorBRandom 
{
	public static void main (String[] args) 
	{
		int A = (int)(Math.random() * 1001);
		int B = (int)(Math.random() *   21);
		
		if (A % B == 0)
		{
			System.out.println("Eh divisivel");
		}
		else
		{
			System.out.println("Nao eh divisivel");
		}
	}
}

