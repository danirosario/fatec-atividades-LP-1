//daniela de toledo rosario

import java.util.Scanner;

public class PodeVotar 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idade;
		
		System.out.print("Entre com o ano atual: ");
		anoAtual = scan.nextInt();
		
		System.out.print("Entre com o ano de nascimento: ");
		anoNascimento = scan.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		if (idade >= 18)
		{
			System.out.println("pode votar");
		}
		else if (idade >= 16)
		{
			System.out.println("voto não obrigatorio");
		}
		else
		{
			System.out.println("nao pode votar");
		}
	}
}

