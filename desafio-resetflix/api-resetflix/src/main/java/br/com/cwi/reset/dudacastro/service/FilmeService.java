package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.model.*;
import br.com.cwi.reset.dudacastro.repository.FilmeRepository;
import br.com.cwi.reset.dudacastro.request.FilmeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;
    private DiretorService diretorService;
    private EstudioService estudioService;
    private AtorService atorService;
    private PersonagemAtorService personagemAtorService;

    public void criarFilme(FilmeRequest filmeRequest) throws Exception {
        Estudio estudio = new EstudioService().consultarEstudio(filmeRequest.getIdEstudio());
        Diretor diretor = new DiretorService().consultarDiretor(filmeRequest.getIdDiretor());
        List<PersonagemAtor> personagens = new PersonagemAtorService().consultarPersonagemAtor(filmeRequest.getPersonagens());
        Filme filme = new Filme(filmeRequest.getNome(), filmeRequest.getAnoLancamento(),
                filmeRequest.getCapaFilme(), filmeRequest.getGeneros(),estudio,diretor,personagens, filmeRequest.getResumo());

        repository.save(filme);

    }

    public List<Filme> consultarFilmes(
            String nomeFilme,
            String nomeDiretor,
            String nomePersonagem,
            String nomeAtor) throws Exception {


        return repository.findByNomeFilmeAndNomeDiretorAndNomePersonagemAndNomeAtor(nomeFilme,nomeDiretor,nomePersonagem,nomeAtor);
    }
}