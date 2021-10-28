package br.com.cwi.reset.dudacastro.repository;

import br.com.cwi.reset.dudacastro.model.PersonagemAtor;
import br.com.cwi.reset.dudacastro.request.PersonagemRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonagemAtorRepository extends CrudRepository<PersonagemAtor, Integer> {


    List<PersonagemAtor> findByNome(List<PersonagemRequest> nome);
}