public class ItensPorQuantidade {

    public static int pao = 3600/60;
    public static int torta = 4;
    public static int sanduiche = 20;
    public static int leite = 20;
    public static int cafe = 20;

    public static int getPao() {
        return pao;
    }

    public static void setPao(int pao) {
        ItensPorQuantidade.pao = pao;
    }

    public static int getTorta() {
        return torta;
    }

    public static void setTorta(int torta) {
        ItensPorQuantidade.torta = torta;
    }

    public static int getSanduiche() {
        return sanduiche;
    }

    public static void setSanduiche(int sanduiche) {
        ItensPorQuantidade.sanduiche = sanduiche;
    }

    public static int getLeite() {
        return leite;
    }

    public static void setLeite(int leite) {
        ItensPorQuantidade.leite = leite;
    }

    public static int getCafe() {
        return cafe;
    }

    public static void setCafe(int cafe) {
        ItensPorQuantidade.cafe = cafe;
    }

    public static int estoqueItem(String item){
        int estoque = 0;
        if(item == "cafe"){

            estoque = getCafe();
        }else if(item == "pao"){

            estoque = getPao();
        }else if(item == "sanduiche"){

            estoque = getSanduiche();
        }else if(item == "leite"){

            estoque = getLeite();
        }else if(item == "torta"){

            estoque = getTorta();
        }


        return estoque;
    }


}


