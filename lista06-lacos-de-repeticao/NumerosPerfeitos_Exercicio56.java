//daniela de toledo rosario

public class NumerosPerfeitos_Exercicio56 
{    
    public static void main (String[] args) 
    {
        int limite = 900;
        
        for (int n = 1; n <= limite; n++) 
        {
            int soma = 0;

            for (int i = 1; i < n; i++) 
            {
                if (n % i == 0) 
                {
                    soma += i;
                }
            }
            
            if (soma == n) 
            {
                System.out.println(n);
            }
        }
    }
}
