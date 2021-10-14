package br.com.cwi.reset.dudacastro;

import java.util.List;

public class AtorService {


    private FakeDatabase fakeDatabase;
    private AtorEmAtividade atorEmAtividade;
    private AtorEmAtividade atorEmAtividadeFiltroNome;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }
    public AtorService(AtorEmAtividade atorEmAtividade) {
        this.atorEmAtividade = atorEmAtividade;
    }


    // Demais métodos da classe


    public void criarAtor(AtorRequest atorRequest) {


        Ator ator = new Ator(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(), atorRequest.getAnoInicioAtividade());

        fakeDatabase.persisteAtor(ator);

        if(ator.getStatusCarreira() == StatusCarreira.EM_ATIVIDADE){

            AtorEmAtividade atorAtivo = new AtorEmAtividade(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(), atorRequest.getAnoInicioAtividade());
            atorEmAtividade.novoAtorEmAtividade(atorAtivo);
        }

    }




    public List<AtorEmAtividade> listarAtoresEmAtividade(String filtroNome){
        if(filtroNome == null || filtroNome == ""){

            return atorEmAtividade.recuperaAtoresEmAtividade();


        }else{
            List<AtorEmAtividade> atorEmAtividadeFiltroNome = atorEmAtividade.recuperaAtoresEmAtividade();
            for(Integer i=0;i< filtroNome.length() ;i++){
                for(Integer g=0;i< atorEmAtividade.recuperaAtoresEmAtividade().size();i++){
                    if(filtroNome.charAt(i) == atorEmAtividade.getNome().charAt(g)){
                        atorEmAtividade.novoAtorEmAtividadeFiltroNome(atorEmAtividade);

                    }
                    break;
                }

                }
            return atorEmAtividadeFiltroNome.recuperaAtoresEmAtividadeFiltroNome();


        return null;
    }


}
}
