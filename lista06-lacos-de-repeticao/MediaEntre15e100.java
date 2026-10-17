//daniela de toledo rosario
//exercicio 16

import java.util.Scanner;

public class MediaEntre15e100 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int numero1 = 15;
		int numero2 = 100;
		int soma    = 0;
		
		for (int i = numero1; i <= numero2; i++)
		{
			soma += i;
		} 
		
		System.out.println(soma);
	}
}

