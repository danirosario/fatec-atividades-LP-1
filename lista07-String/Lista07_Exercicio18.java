//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio18 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String sequencia = "";
		boolean sequenciaBinariaDe8Bits = true;
		
		System.out.print("Entre com uma sequencia de caractere para verificar se eh uma sequencia binaria de 8 bits: ");
		sequencia = scan.nextLine();
		
		if (sequencia.length() == 8) 
		{
			for (int i = 0; i < sequencia.length(); i++) 
			{
				char c = sequencia.charAt(i);
				
				if (c != '0' && c != '1') 
				{
					sequenciaBinariaDe8Bits = false;
					break;
				}
			}
		}
		else
		{
			sequenciaBinariaDe8Bits = false;
		}
		
		if (sequenciaBinariaDe8Bits) 
		{
			System.out.println("Eh uma sequencia binaria de 8 bits");
		} 
		else 
		{
			System.out.println("Nao eh uma sequencia binaria de 8 bits");
		}
	}
}
