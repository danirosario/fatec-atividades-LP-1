//daniela de toledo rosario

import java.util.Scanner;

public class Tabuada1A10 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int x;
		int resultado;
		
		System.out.print("Inrira um numero: ");
		x = scan.nextInt();
		
		while(x < 1 || x > 10)
		{
			System.out.println("O numero deve estar entre 1 e 10!");
			System.out.print("\nInrira um numero: ");
			x = scan.nextInt();
		}
		for (int i = 1; i <= 10; i++)
		{
			resultado = i * x;
			System.out.println(i + " x " + x + " = " + resultado);
		}
	}
}

