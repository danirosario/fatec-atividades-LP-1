//daniela de toledo rosario

import java.util.Scanner;

public class SequenciaDeRicci_Exercicio58 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a, b, c = 0;
		
		System.out.print("Insira o primeiro termo: ");
		a = scan.nextInt();
		
		System.out.print("Insira o segundo termo: ");
		b = scan.nextInt();
		
		System.out.println("Sequencia de Ricci: ");
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	
	}
}

