//daniela de toledo rosario
import java.util.Scanner;

public class ADivisivelPorB 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite o primeiro numero para divisao (A): ");
		a = scan.nextInt();
		
		if (a < 0 || a > 1000) 
		{
			System.out.println("Numero invalido, em A sao permitidos apenas numeros entre 0 e 1000 (inclusos)");
			return;
		}
		
		System.out.print("Digite o segundo numero para divisao (B): ");
		b = scan.nextInt();
		
		if (b < 0 || b > 20) 
		{
			System.out.println("Numero invalido, em B sao permitidos apenas numeros entre 0 e 20 (inclusos)");
			return;
		}
		
		if (a < b)
		{
			System.out.println("O valor de B eh maior que A");
		}
		
		if (a % b == 0)
		{
			System.out.println("Eh divisivel");
		}
		else
		{
			System.out.println("Nao eh divisivel");
		}
		
	}
}

