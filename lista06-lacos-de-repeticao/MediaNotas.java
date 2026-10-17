//daniela de toledo rosario
//exercicio 11

import java.util.Scanner;

public class MediaNotas 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int qntAlunos = 0;
		int nota      = 0;
		int somaNotas = 0;
		double media  = 0.0;
		
		System.out.print("Insira a quantidade de alunos: ");
		qntAlunos = scan.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < qntAlunos; i++)
		{
			System.out.print("Insira as notas dos alunos: ");
			nota = scan.nextInt();
			
			somaNotas = nota + somaNotas;
		}
		media = somaNotas / (double)qntAlunos;
		
		System.out.println("A media aritmetica das notas dos alunos eh: " + media);
	}
}

