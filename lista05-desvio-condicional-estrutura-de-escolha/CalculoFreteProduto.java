import java.util.Scanner;

public class CalculoFreteProduto 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double preco;
        int codigo;
        String procedencia;
        double percentualFrete = 0.0;
        double valorFrete;
        double valorFinal;

        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        System.out.print("Digite o código de origem do produto: ");
        codigo = scanner.nextInt();

        switch(codigo)
        {
            case 1:
                procedencia = "Norte";
                percentualFrete = 0.10;
                break;
            case 2:
            case 5:
            case 9:
                procedencia = "Sul";
                percentualFrete = 0.03;
                break;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                procedencia = "Leste";
                percentualFrete = 0.012;
                break;
            case 7:
            case 20:
                procedencia = "Oeste";
                percentualFrete = 0.073;
                break;
            default:
                procedencia = "Importado";
                percentualFrete = 0.222;
        }

        valorFrete = preco * percentualFrete;
        valorFinal = preco + valorFrete;

        System.out.println("\n--- Resumo do Produto ---");
        System.out.printf("Preço do produto: R$ %.2f\n", preco);
        System.out.println("Procedência: " + procedencia);
        System.out.printf("Valor do frete (%.1f%%): R$ %.2f\n", (percentualFrete * 100), valorFrete);
        System.out.printf("Valor final a ser pago: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}