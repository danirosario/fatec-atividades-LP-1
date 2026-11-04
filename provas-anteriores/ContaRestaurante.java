import java.util.Scanner;

public class ContaRestaurante 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double valorConta      = 0.0;
		double valorIndividual = 0.0;
		int quantidadePessoas  = 0;
		int pagarValorGarcon   = 0;
		
		System.out.print("Valor da conta: ");
		valorConta = scan.nextDouble();
		
		System.out.print("Quantidade de pessoas: ");
		quantidadePessoas = scan.nextInt();
		
		System.out.print("Deseja para taxa do garcon? (1 - Sim ou 2 - Nao) ");
		pagarValorGarcon = scan.nextInt();
		
		if (pagarValorGarcon == 1)
		{
			double taxaGarcon = valorConta * 0.1;
			valorConta = valorConta + taxaGarcon;
		}
		valorIndividual = valorConta / quantidadePessoas;
		
		System.out.println("\nConta a ser paga: R$ " + valorConta);
		System.out.println("Dividida para: " + quantidadePessoas);
		System.out.println("Valor individual: R$ " + valorIndividual);
	}
}

