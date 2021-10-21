package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.model.Filme;
import br.com.cwi.reset.dudacastro.request.FilmeRequest;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {

    private FakeDatabase fakeDatabase;
    private DiretorService diretorService;
    private EstudioService estudioService;
    private AtorService atorService;
    private PersonagemAtorService personagemAtorService;

    public FilmeService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
        this.diretorService = new DiretorService(fakeDatabase);
        this.estudioService = new EstudioService(fakeDatabase);
        this.atorService = new AtorService(fakeDatabase);
        this.personagemAtorService = new PersonagemAtorService(fakeDatabase);
    }

    public void criarFilme(FilmeRequest filmeRequest) throws Exception {

    }

    public List<Filme> consultarFilmes(
            String nomeFilme,
            String nomeDiretor,
            String nomePersonagem,
            String nomeAtor) throws Exception {
        List<Filme> filmes = new ArrayList<>();

        return filmes;
    }
}