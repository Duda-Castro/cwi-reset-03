package br.com.cwi.reset.dudacastro.repository;


import br.com.cwi.reset.dudacastro.model.Ator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AtorRepository extends CrudRepository<Ator, Integer> {


}