package br.com.cwi.reset.dudacastro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AtorEmAtividade extends Ator{

    public AtorEmAtividade(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        super(nome, dataNascimento, statusCarreira, anoInicioAtividade);
    }

    List<AtorEmAtividade> atoresEmAtividade= new ArrayList<>();
    List<AtorEmAtividade> atoresEmAtividadeFiltroNome = new ArrayList<>();

    public void novoAtorEmAtividade(AtorEmAtividade atorEmAtividade) {

        atoresEmAtividade.add(atorEmAtividade);
    }

    public List<AtorEmAtividade> recuperaAtoresEmAtividade() {
        return atoresEmAtividade;
    }

    public void novoAtorEmAtividadeFiltroNome(AtorEmAtividade atorEmAtividadeFiltroNome) {

        atoresEmAtividadeFiltroNome.add(atorEmAtividadeFiltroNome);
    }

    public List<AtorEmAtividade> recuperaAtoresEmAtividadeFiltroNome() {
        return atoresEmAtividadeFiltroNome;
    }



}
