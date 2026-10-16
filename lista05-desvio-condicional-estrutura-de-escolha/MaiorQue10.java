//daniela de toledo rosario

import java.util.Scanner;

public class MaiorMenorQue10 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scan.nextInt();
		
		if (numero > 10)
		{
			System.out.println("EH MAIOR QUE 10!");
		}
		else
		{
			System.out.println("NAO EH MAIOR QUE 10!");
		}
	}
}

