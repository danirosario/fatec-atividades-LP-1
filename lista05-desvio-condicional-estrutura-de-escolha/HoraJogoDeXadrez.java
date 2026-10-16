//daniela de toledo rosario

import java.util.Scanner;

public class HoraJogoDeXadrez 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int horaInicio    = 0;
		int horaFinal     = 0;
		int totalHoras    = 0;
		int duracaoMaxima = 24;
		
		
		System.out.print("Insira a hora de inicio do jogo de xadrez: ");
		horaInicio = scan.nextInt();
		
		System.out.print("Insira a hora de termino do jogo de xadrez: ");
		horaFinal = scan.nextInt();  
		
		if ( horaInicio < horaFinal )
		{
			totalHoras = horaFinal - horaInicio;
		}
		else
		{
			totalHoras = (duracaoMaxima - horaInicio) + horaFinal;
		}
		
		System.out.println("\nO jogo teve duracao total de: " + totalHoras + " horas");
		
		
		
	}
}

