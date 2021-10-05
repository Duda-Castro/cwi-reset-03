public class ReducaoEstoque {

        public static void reduzEstoque(String item, int qtd) {

                if ("pao".equals(item)) {
                        ItensPorQuantidade.setPao(ItensPorQuantidade.getPao() - qtd);

                }

                if ("torta".equals(item)) {
                        ItensPorQuantidade.setTorta(ItensPorQuantidade.getTorta() - qtd);
                }

                if ("leite".equals(item)) {
                        ItensPorQuantidade.setLeite(ItensPorQuantidade.getLeite() - qtd);
                }

                if ("cafe".equals(item)) {
                        ItensPorQuantidade.setCafe(ItensPorQuantidade.getCafe() - qtd);
                }

                if ("sanduiche".equals(item)) {
                        ItensPorQuantidade.setSanduiche(ItensPorQuantidade.getSanduiche() - qtd);
                }


        }







}
