//daniela de toledo rosario

import java.util.Scanner;

public class Fibonacci_Exercicio51 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;
		int qntTermos;
		
		System.out.print("Informe a quantidade de termos: ");
		qntTermos = scan.nextInt();
		
		for (int i = 0; i < qntTermos; i++)
		{
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		
	}
}

