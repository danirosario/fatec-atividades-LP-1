//daniela de toledo rosario
import java.util.Scanner;

public class Saudacao 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int opcao;
		int horas;
		
		System.out.print("Digite (1) para entrada manual ou (2) para gerar hora aleatoriamente: ");
		opcao = scan.nextInt();
		
		if(opcao == 1)
		{
			System.out.print("Entre com a hora atual: ");
			horas = scan.nextInt();
		}
		else
		{
			horas = (int)(Math.random() * 24);
		}
		if(horas >= 0 && horas <=6)
			{
				System.out.println("Zzzzz");
			}
			else if(horas <= 11)
			{
				System.out.println("Bom dia");
			}
			else if(horas <= 17)
			{
				System.out.println("BoA tarde");
			}
			else if(horas >= 23)
			{
				System.out.println("Boa noite");
			}
			
	}
}

