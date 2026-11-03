//daniela de toledo rosario

import java.util.Scanner;

public class Fibonacci_Exercicio54 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print("Insira o termo inicial: ");
		int termoInicial = scan.nextInt();
		
		System.out.print("Insira o termo final: ");
		int termoFinal = scan.nextInt();
		
		for (int i = 1; i <= termoFinal; i++)
		{
			if (i >= termoInicial && i <= termoFinal)
			{
				System.out.println(a);
			}
			
            c = a + b;
            a = b;
            b = c;
        }   
	}
}

