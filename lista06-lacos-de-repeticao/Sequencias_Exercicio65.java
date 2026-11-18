//daniela de toledo rosario

import java.util.Scanner;

public class Sequencias_Exercicio65
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.print("Digite a quantidade de termos: ");
        n = scan.nextInt();

        System.out.println("\nSequencia:");

        int primo = 2;
        int fatorial = 1;

        for (int i = 1; i <= n; i++)
        {
            if (i == 1)
			{
				fatorial = -1;
			}
			else
			{
				fatorial = 1;

				for (int j = 1; j < i; j++)
				{
					fatorial = fatorial * j;
				}
			}

            boolean ehPrimo = false;

            while (!ehPrimo)
            {
                ehPrimo = true;

                for (int j = 2; j < primo; j++)
                {
                    if (primo % j == 0)
                    {
                        ehPrimo = false;
                        break;
                    }
                }

                if (!ehPrimo)
                {
                    primo++;
                }
            }

            if (i > 1)
            {
                if (i % 2 == 0)
                {
                    System.out.print(" + ");
                    soma -= (double) fatorial / primo;
                }
                else
                {
                    System.out.print(" - ");
                    soma += (double) fatorial / primo;
                }
            }
            else
            {
                soma += (double) fatorial / primo;
            }

            System.out.print(fatorial + "/" + primo);

            primo++;
        }

        System.out.printf("\n\nSoma dos termos: %.2f\n", soma);

        scan.close();
    }
}

