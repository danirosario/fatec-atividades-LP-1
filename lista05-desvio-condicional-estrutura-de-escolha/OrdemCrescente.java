//daniela de toledo rosario

import java.util.Scanner;

public class OrdemCrescente
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Insira o primeiro numero: ");
		a = scan.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		b = scan.nextInt();
		
		if (a == b)
		{
			System.out.print("Insira numeros diferentes! ");
			return;
		}
		
		if (a > b)
		{
			System.out.print(b + " " + a);
		}
		else 
		{
			System.out.print(a + " " + b);
		}
	}
}

