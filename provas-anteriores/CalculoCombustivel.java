import java.util.Scanner;

public class CalculoCombustivel 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		
		String opcaoEscolhida;
		int litrosAbastecidos     = 0;
		double valorPorLitro      = 0.0;
		double valorBruto         = 0.0;
		double valorPago          = 0.0;
		double descontoPercentual = 0.0;
		double valorDesconto      = 0.0;
		
		System.out.println("A - Alcool");
		System.out.println("G - Gasolina");
		System.out.println("D - Diesel");
		
		System.out.print("\nInsira o tipo de combustivel: ");
		opcaoEscolhida = scanStr.nextLine();
		
		System.out.print("\nInsira o valor por litro: ");
		valorPorLitro = scan.nextDouble();
		
		System.out.print("\nInsira a quantidade de litros abastecidos: ");
		litrosAbastecidos = scan.nextInt();
		
		valorBruto = litrosAbastecidos * valorPorLitro;
		
		char escolha = opcaoEscolhida.charAt(0);
		
		switch(escolha)
		{
			case 'A':
			case 'a':
                if (litrosAbastecidos > 40) 
                {
                    descontoPercentual = 0.187;
                } 
                else if (litrosAbastecidos > 10) 
                {
                    descontoPercentual = 0.10;
                }
                break;
                
            case 'G':
            case 'g':
                if (valorBruto > 100.00) 
                {
                    descontoPercentual = 0.15;
                } 
                else if (litrosAbastecidos > 20) 
                {
                    descontoPercentual = 0.08;
                }
                break;
                
            case 'D':
            case 'd':
                if (valorBruto > 75.00) 
                {
                    descontoPercentual = 0.142; 
                } 
                else if (litrosAbastecidos > 30) 
                {
                    descontoPercentual = 0.09; 
                }
                break;
                
			default:
				System.out.println("Opcao Invalida!");
		}
		
		valorDesconto = valorBruto * descontoPercentual;
		valorPago = valorBruto - valorDesconto;
		
		System.out.printf("\nValor a ser pago: R$ %.2f\n", valorPago);
	}
}

