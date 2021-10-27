package br.com.cwi.reset.dudacastro.repository;


import br.com.cwi.reset.dudacastro.model.Estudio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudioRepository extends CrudRepository<Estudio, Integer> {



}