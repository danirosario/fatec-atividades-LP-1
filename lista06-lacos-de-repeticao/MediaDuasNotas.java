//daniela de toledo rosario
//exercicio 17

import java.util.Scanner;

public class MediaDuasNotas 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S') 
        {
            double nota1 = -1;
            double nota2 = -1;
            double media =  0;
            
            while (nota1 < 0 || nota1 > 10) 
            {
				System.out.print("Insira a primeira nota (0 a 10): ");
				nota1 = scan.nextDouble();
				if (nota1 < 0 || nota1 > 10) 
				{
					System.out.println("Nota invalida! Digite novamente.");
				}
			}

            while (nota2 < 0 || nota2 > 10) 
            {
                System.out.print("Insira a segunda nota (0 a 10): ");
                nota2 = scan.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota invalida! Digite novamente.");
                }
            }

            media = (nota1 + nota2) / 2.0;
            System.out.printf("Media do aluno: %.2f\n", media);

            System.out.print("NOVO CALCULO (S/N)? ");
            continuar = scan.next().toUpperCase().charAt(0);
        }
    }
}

