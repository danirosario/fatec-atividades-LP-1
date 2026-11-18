import java.util.Scanner;

public class SequenciaDeRicci_Exercicio60 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
	
		int n1, n2, numeroBuscado = 0;
		boolean pertence = false;
		
        System.out.print("Digite o primeiro termo da sequencia: ");
        n1 = scanner.nextInt();

        System.out.print("Digite o segundo termo da sequencia: ");
        n2 = scanner.nextInt();

        System.out.print("Digite o numero que deseja verificar: ");
        numeroBuscado = scanner.nextInt();

        if (n1 == numeroBuscado || n2 == numeroBuscado) 
        {
            pertence = true;
        } 
        else 
        {
            int a = n1;
            int b = n2;
            int c = a + b;

            while (c <= numeroBuscado) 
            {
                if (c == numeroBuscado) 
                {
                    pertence = true;
                    break;
                }
                c = a + b;
				a = b;
				b = c;
            }
        }

        if (pertence) 
        {
            System.out.println("PERTENCE a sequencia de Ricci.");
        } 
        else 
        {
            System.out.println("NAO PERTENCE a sequencia de Ricci.");
        }
    }
}
