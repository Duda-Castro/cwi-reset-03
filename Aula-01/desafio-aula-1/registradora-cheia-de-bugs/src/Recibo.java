
public class Recibo {

    public static void recibo(String nome, String item, int qtd) {
        Double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, qtd);
        System.out.println("/////// RECIBO DE COMPRA ///////");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Item: " + item);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Valor total: " + precoItem);




    }





}
