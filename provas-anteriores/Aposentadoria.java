import java.util.Scanner;

public class Aposentadoria 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int codigo = 0;
		int anoNascimento = 0;
		int anoIngresso = 0;
		int idade = 0;
		int anoAtual = 2026;
		int tempoTrabalhado = 0;
		
		
		System.out.print("Insira o codigo: ");
		codigo = scan.nextInt();
		
		System.out.print("Insira o ano de nascimento: ");
		anoNascimento = scan.nextInt();
		
		System.out.print("Insira o ano de ingresso na empresa: ");
		anoIngresso = scan.nextInt();
		
		idade = anoAtual - anoNascimento;
		tempoTrabalhado = anoAtual - anoIngresso;
		
		boolean podeRequererAposentadoria = (idade >= 60 && tempoTrabalhado >= 25) || (idade >= 65 ) || (tempoTrabalhado >= 30);
		
		if (podeRequererAposentadoria)
		{
			System.out.println("Pode requerer aposentadoria");
		}
		else
		{
			System.out.println("Nao pode requerer");
		}
	}
}

