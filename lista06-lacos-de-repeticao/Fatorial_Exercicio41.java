//daniela de toledo rosario

import java.util.Scanner;

public class Fatorial_Exercicio41
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.print("Insira um numero: ");
		int n = scan.nextInt();
		
		while (n >= 1)
		{
			fatorial = fatorial * n;
			n--;
		}
		System.out.println("\nfatorial: " + fatorial);
	}
}
