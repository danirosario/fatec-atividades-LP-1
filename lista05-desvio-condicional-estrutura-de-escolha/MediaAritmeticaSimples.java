//daniela de toledo rosario

import java.util.Scanner;

public class MediaAritmeticaSimples 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int nota1, nota2;
		double media;
		String status;
		
		System.out.print("Insira a primeira nota: ");
		nota1 = scan.nextInt();
		
		System.out.print("Insita a segunda nota: ");
		nota2 = scan.nextInt();
		
		media = (double)(nota1 + nota2) / 2 ;
		
		if (media >= 6)
		{
			status = "Aprovado";
		}
		else
		{
			status = "Nao Aprovado";
		}
		
		System.out.println("\nA media obtida foi: " + media + "\nO aluno foi: " + status);
	}
}

