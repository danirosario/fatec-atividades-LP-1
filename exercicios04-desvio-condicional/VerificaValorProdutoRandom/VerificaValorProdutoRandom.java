//daniela de toledo rosario

public class VerificaValorProdutoRandom 
{
	public static void main (String[] args) 
	{
		int precoProduto1 = (int)(Math.random() * 1001);
		int precoProduto2 = (int)(Math.random() * 1001);
		
		if (precoProduto1 < precoProduto2)
		{
			System.out.println("O produto 1 e o mais barato");
		}
		else if(precoProduto2 < precoProduto1) 
		{
			System.out.println("O produto 2 e o mais barato");
		}
		else
		{
			System.out.println("Os precos dos dois produtos sao iguais");
		}
	}
}

