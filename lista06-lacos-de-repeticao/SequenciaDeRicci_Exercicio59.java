//daniela de toledo rosario

import java.util.Scanner;

public class SequenciaDeRicci_Exercicio59
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, qntTermos = 0;
		
		System.out.print("Insira o primeiro termo: ");
		a = scan.nextInt();
		
		System.out.print("Insira o segundo termo: ");
		b = scan.nextInt();
		
		System.out.print("Insira a quantidade de termos: ");
		qntTermos = scan.nextInt();
		
		System.out.println("\nSequencia de Ricci: ");
		
		for (int i = 0; i < qntTermos; i++)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	
	}
}

