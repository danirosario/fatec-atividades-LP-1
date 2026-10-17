//daniela de toledo rosario
//exercicio 20

import java.util.Scanner;

public class MaiorMenosValores 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int valorMaior = 0;
		int valorMenor = 0;
		int num = 0;
		
		for (int i = 0; i < 100; i++)
		{
			System.out.print("Insira o " + (i + 1) + " valor: ");
			num = scan.nextInt();
			if (valorMaior < num)
			{
				valorMaior = num;
			}
			if (valorMenor > num)
			{
				valorMenor = num;
			}
		}
		
		System.out.println();
		System.out.println("Menor valor: " + valorMenor);
		System.out.println("Maior valor: " + valorMaior);
	}
}

