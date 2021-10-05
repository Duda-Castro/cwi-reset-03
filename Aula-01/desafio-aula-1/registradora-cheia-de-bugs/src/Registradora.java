
public class Registradora {

    public static void main(String[] args) {

        primeiroBug();
        System.out.println("iniciobug 2");
        segundoBug();
        System.out.println("iniciobug 3");
        terceiroBug();
        System.out.println("iniciobug 4");
        quartoBug();
        System.out.println("iniciobug 5");
        quintoBug();

        //sextoBug();
    }

    private static double registrarItem(String item, int quantidade) {
        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
        ReducaoEstoque.reduzEstoque(item,quantidade);

        if (QuantidadeMinimaItem.precisaReposicao(item)) {
            if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                if(ItensPorQuantidade.estoqueItem(item) < 0){
                    System.out.println("Faltam " + ItensPorQuantidade.estoqueItem(item) * -1 + " itens para fechar o pedido.");
                }else if (ItensPorQuantidade.estoqueItem(item) >= 0){
                    System.out.println("Restam apenas " + ItensPorQuantidade.estoqueItem(item) + " unidades de " + item);
                }
                System.out.println("Solicitar para a cozinha repor estoque de " + item);
                if (!DataProjeto.cozinhaEmFuncionamento()) {
                    System.out.println("Cozinha fechada, reposição pela manhã! Pedido do cliente agendado para 7:00 a.m.");
                }
                ReposicaoCozinha.reporItem(item);

            }

            if ("leite".equals(item) || "cafe".equals(item)) {
                if(ItensPorQuantidade.estoqueItem(item) < 0){
                    System.out.println("Faltam " + ItensPorQuantidade.estoqueItem(item) * -1 + " itens para fechar o pedido.");
                }else if (ItensPorQuantidade.estoqueItem(item) >= 0){
                    System.out.println("Restam apenas " + ItensPorQuantidade.estoqueItem(item) + " unidades de " + item);
                }
                System.out.println("Solicitar estoque de " + item + " ao fornecedor.");
                ReposicaoFornecedor.reporItem(item);

            }
        }



        return precoItem;
    }

    private static void primeiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void segundoBug() {
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void quartoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

    private static void quintoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "pao";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void sextoBug() {
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

}
