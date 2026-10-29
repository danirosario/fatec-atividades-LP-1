//daniela de toledo rosario

public class lista06_exercicio27
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print(i + ", ");
            for (int j = 1; j <= 11 - i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

