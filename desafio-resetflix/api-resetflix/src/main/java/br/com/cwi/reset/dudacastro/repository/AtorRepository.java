package br.com.cwi.reset.dudacastro.repository;


import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.StatusCarreira;
import br.com.cwi.reset.dudacastro.response.AtorEmAtividade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AtorRepository extends CrudRepository<Ator, Integer> {

    Ator findByNome(String nome);
    Ator findByStatusCarreira(StatusCarreira statusCarreira);
    List<Ator> findAllByStatusCarreira(StatusCarreira statusCarreira);
    List<Ator> findAll();
}