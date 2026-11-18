import java.util.Scanner;

public class Sequencias_Exercicio61
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.print("Digite a quantidade de termos: ");
        n = scan.nextInt();

        System.out.println("\nSequencia:");

        for (int i = 1; i <= n; i++) 
        {
            int numerador = 2 * i;
            int denominador = (2 * i) - 1;
			if (numerador == 2 && denominador == 1)
			{
				System.out.print(numerador + "/" + denominador);
			} 
			else
			{
				System.out.print(" +" + denominador + " ");
				System.out.print(numerador + "/");
			}

            soma += (double) numerador / denominador;

        }

        System.out.printf("\n\nSoma dos termos: %.2f\n", soma);
    }
}
