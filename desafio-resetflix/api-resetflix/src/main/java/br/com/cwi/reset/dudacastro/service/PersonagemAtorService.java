package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.PersonagemAtor;
import br.com.cwi.reset.dudacastro.repository.AtorRepository;
import br.com.cwi.reset.dudacastro.repository.PersonagemAtorRepository;
import br.com.cwi.reset.dudacastro.request.PersonagemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemAtorService {

    @Autowired
    private PersonagemAtorRepository repository;

    public void cadastrarPersonagemAtor(PersonagemRequest personagemRequest) throws Exception {
        Ator ator = new AtorService().consultarAtor(personagemRequest.getIdAtor());
        PersonagemAtor personagemAtor = new PersonagemAtor(ator,personagemRequest.getNomePersonagem(),personagemRequest.getDescricaoPersonagem(),personagemRequest.getTipoAtuacao());

        repository.save(personagemAtor);
    }

    public List<PersonagemAtor> consultarPersonagemAtor(String nome) throws Exception {

        return repository.findByNome(nome);

    }
}