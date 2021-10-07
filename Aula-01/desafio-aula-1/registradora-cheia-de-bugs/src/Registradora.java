import java.util.Objects;
import java.util.Scanner;
public class Registradora {

    public static void main(String[] args) {
        System.out.println("teste cadastro");
        cadastrarPedido();
        System.out.println("inicio bug 1");
        cadastrarPedido1();
        System.out.println("inicio bug 2");
        cadastrarPedido2();
        System.out.println("inicio bug 3");
        cadastrarPedido3();
        System.out.println("inicio bug 4");
        cadastrarPedido4();
        System.out.println("inicio bug 5");
        cadastrarPedido5();
        System.out.println("inicio bug 6");
        cadastrarPedido6();
    }

    private static double registrarItem(String nome, String item, int quantidade) {
        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
        String name = nome;
        String produto = item;
        int qtd = quantidade;
        double pedidoCancelado = 0.00;
        ReducaoEstoque.reduzEstoque(item, quantidade);
        Scanner scan = new Scanner(System.in);
        String agendamento = "padrao";


        if (QuantidadeMinimaItem.precisaReposicao(item)) {
            if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                if (ItensPorQuantidade.estoqueItem(item) < 0) {
                    System.out.println("Faltam " + ItensPorQuantidade.estoqueItem(item) * -1 + " itens para fechar o pedido.");
                } else if (ItensPorQuantidade.estoqueItem(item) >= 0) {
                    System.out.println("Restam apenas " + ItensPorQuantidade.estoqueItem(item) + " unidades de " + item);
                }
                System.out.println("Solicitar para a cozinha repor estoque de " + item);
                if (!DataProjeto.cozinhaEmFuncionamento()) {

                    System.out.println("Cozinha fechada, reposição pela manhã! Deseja agendar o seu pedido? (Horário de atendimento: 7:00 - 16:40). (S/N).");
                    agendamento = scan.next();

                    while (!Objects.equals(agendamento, "S") && !Objects.equals(agendamento, "N")) {
                        System.out.println("Comando inválido, favor digitar novamente (S/N).");
                        agendamento = scan.next();

                    }

                    if ("S".equals(agendamento)) {
                        System.out.println("Pedido do cliente agendado para 7:00 a.m. do próximo dia útil.");
                    } else if ("N".equals(agendamento)) {
                        System.out.println("Obrigado, tenha um bom dia!");

                    }
                }

            }
            ReposicaoCozinha.reporItem(item);

        }

        if ("leite".equals(item) || "cafe".equals(item)) {
            if (ItensPorQuantidade.estoqueItem(item) < 0) {
                System.out.println("Faltam " + ItensPorQuantidade.estoqueItem(item) * -1 + " itens para fechar o pedido.");
            } else if (ItensPorQuantidade.estoqueItem(item) >= 0) {
                System.out.println("Restam apenas " + ItensPorQuantidade.estoqueItem(item) + " unidades de " + item);
            }
            System.out.println("Solicitar estoque de " + item + " ao fornecedor.");
            ReposicaoFornecedor.reporItem(item);

        }


        if ("S".equals(agendamento) || "padrao".equals(agendamento)) {
            Recibo.recibo(name, produto, qtd);
            return precoItem;
        } else {
            return pedidoCancelado;
        }
    }


    private static void cadastrarPedido() {
        DataProjeto.criarDataComCozinhaFuncionando();
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do cliente: ");
        nome = scan.next();
        String item;
        System.out.println("Digite o produto: ");
        item = scan.next();
        int quantidade;
        System.out.println("Digite a quantidade: ");
        quantidade = scan.nextInt();

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido1() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String nome = "Luke";
        String item = "sanduiche";
        int quantidade = 4;

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido2() {
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        String nome = "Duda";
        String item = "torta";
        int quantidade = 10;

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido3() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String nome = "Léia";
        String item = "cafe";
        int quantidade = 40;

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido4() {
        DataProjeto.criarDataComCozinhaFuncionando();
        //cliente 1
        String nome = "Chewie";
        String item = "sanduiche";
        int quantidade = 20;

        registrarItem(nome, item, quantidade);
        //cliente 2
        nome = "Carlos";
        item = "sanduiche";
        quantidade = 5;

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido5() {
        DataProjeto.criarDataComCozinhaFuncionando();

        String nome = "Han";
        String item = "pao";
        int quantidade = 10;

        registrarItem(nome, item, quantidade);


    }

    private static void cadastrarPedido6() {
        DataProjeto.criarDataComCozinhaFuncionando();
        //cliente 1
        String nome = "Jarjar";
        String item = "sanduiche";
        int quantidade = 20;

        registrarItem(nome, item, quantidade);
        //cliente 2
        nome = "Jabba";
        item = "sanduiche";
        quantidade = 5;

        registrarItem(nome, item, quantidade);


    }

}






