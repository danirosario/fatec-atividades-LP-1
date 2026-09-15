public class GerenciamentoMercadorias 
{
    public static void main(String[] args) 
    {
        int    numeroPedido     = 102;
        String codigoProduto    = "COD-9982";
        int    quantidade       = 3;
        double valorTotalCompra = 149.90;

        System.out.println("--- DETALHES DO PEDIDO ---\n");
        System.out.println("     Numero do Pedido:\t "    + numeroPedido);
        System.out.println("    Codigo do Produto:\t "    + codigoProduto);
        System.out.println("           Quantidade:\t "    + quantidade);
        System.out.println("Valor Total da Compra:\t R$ " + valorTotalCompra);
    }
}