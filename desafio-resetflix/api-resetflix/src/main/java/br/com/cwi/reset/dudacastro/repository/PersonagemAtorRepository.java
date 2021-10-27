package br.com.cwi.reset.dudacastro.repository;

import br.com.cwi.reset.dudacastro.model.PersonagemAtor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonagemAtorRepository extends CrudRepository<PersonagemAtor, Integer> {


}