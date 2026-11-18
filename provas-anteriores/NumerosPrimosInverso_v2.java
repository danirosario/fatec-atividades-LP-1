import java.util.Scanner;

public class NumerosPrimosInverso_v2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n;

        do 
        {
            System.out.print("Entre com a quantidade de termos da sequencia de primos: ");
            n = scan.nextInt();

            while (n < 0) 
            {
                System.out.println("Quantidade Inválida!");
                System.out.print("Entre com a quantidade de termos da sequencia de primos: ");
                n = scan.nextInt();
            }

            if (n > 0) 
            {
                for (int posicao = n; posicao >= 1; posicao--) 
                {
                    int contador = 0;
                    int candidato = 1;
                    
                    while (contador < posicao) 
                    {
                        candidato++;

                        boolean primo = true;
                        for (int d = 2; d * d <= candidato; d++) 
                        {
                            if (candidato % d == 0) 
                            {
                                primo = false;
                                break;
                            }
                        }

                        if (primo) 
                        {
                            contador++;
                        }
                    }

                    System.out.print(candidato);
                    if (posicao > 1) 
                    {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        } 
        while (n != 0);

        System.out.println("Fim do programa!");
    }
}
