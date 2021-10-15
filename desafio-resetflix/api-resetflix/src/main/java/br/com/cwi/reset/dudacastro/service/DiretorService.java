package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.response.AtorEmAtividade;
import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.StatusCarreira;
import br.com.cwi.reset.dudacastro.request.AtorRequest;

import java.util.List;

public class DiretorService {


    private FakeDatabase fakeDatabase;
    private AtorEmAtividade atorEmAtividade;
    private AtorEmAtividade atorEmAtividadeFiltroNome;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }
    public DiretorService(AtorEmAtividade atorEmAtividade) {
        this.atorEmAtividade = atorEmAtividade;
    }


    // Demais métodos da classe


    public void cadastrarDiretor (AtorRequest atorRequest) {


        Ator ator = new Ator(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(), atorRequest.getAnoInicioAtividade());

        fakeDatabase.persisteAtor(ator);

        if(ator.getStatusCarreira() == StatusCarreira.EM_ATIVIDADE){

            AtorEmAtividade atorEmAtividade = new AtorEmAtividade(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(), atorRequest.getAnoInicioAtividade());
            atorEmAtividade.novoAtorEmAtividade(atorEmAtividade);
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
            return atorEmAtividade.recuperaAtoresEmAtividadeFiltroNome();



    }


}
}
