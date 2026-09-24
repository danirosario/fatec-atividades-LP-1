//daniela de toledo rosario

import java.util.Scanner;

public class AprovadoReprovado 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.print("Entre com uma nota: ");
		nota = scan.nextInt();
		
		if (nota < 0 || nota > 10)
		{
			System.out.println("VALOR INVALIDO");
		}
		else if (nota < 6)
		{
			System.out.println("REPROVADO");
		}
		else
		{
			System.out.println("APROVADO");
		}
	}
}
