import java.util.Scanner;

public class NumeroPrimo 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("\nInsira a quantidade de termos: ");
            int qntTermos = scan.nextInt();
            
            if (qntTermos == 0)
            {
                System.out.println("Fim do programa!");
                break;
            }
            if (qntTermos < 0)
            {
                System.out.println("Quantidade Invalida!");
                continue;
            }
            
            for (int i = qntTermos; i >= 1; i--)
            {
				int contador = 0;
				int numCandidato = 1;
				
				while(contador < i)
				{
					numCandidato++;
					boolean primo = true;
					
					for (int j = 2; j*j <= numCandidato; j++)
					{
						if (numCandidato % j == 0) 
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

                System.out.print(numCandidato + " ");
			}
		}
	}
}
