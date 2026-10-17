//daniela de toledo rosario

import java.util.Scanner;

public class ValoresInteirosAteN 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.print("Insira um numero N: ");
		n = scan.nextInt();
		
		if (n <= 0)
		{
			System.out.println("O valor deve ser maior que 0!");
			return;
		}
		
		for (int i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
		
	}
}

