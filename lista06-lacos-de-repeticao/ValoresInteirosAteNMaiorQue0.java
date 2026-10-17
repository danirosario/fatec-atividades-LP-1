//daniela de toledo rosario

import java.util.Scanner;

public class ValoresInteirosAteNMaiorQue0
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.print("Insira um numero N: ");
		n = scan.nextInt();
		
		while(n <= 0)
		{
			System.out.println("O valor deve ser maior que 0!");
			System.out.print("Insira um numero N: ");
			n = scan.nextInt();
		}
		
		System.out.println();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
		
	}
}
