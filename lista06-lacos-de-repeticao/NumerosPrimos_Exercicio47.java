//daniela de toledo rosario

public class NumerosPrimos_Exercicio47 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Numeros primos de 0 a 100:");
        
        for (int i = 2; i < 100; i++) 
        {
            boolean ehPrimo = true;
            int raiz = (int) Math.sqrt(i);
            
            for (int j = 2; j <= raiz; j++) 
            {
                if (i % j == 0) 
                {
                    ehPrimo = false;
                    break; 
                }
            }
            
            if (ehPrimo) 
            {
                System.out.println(i);
            }
        }
    }
}
