package br.com.cwi.reset.dudacastro.repository;


import br.com.cwi.reset.dudacastro.model.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Integer> {


    List<Filme> findByNomeFilmeAndNomeDiretorAndNomePersonagemAndNomeAtor(String nomeFilme,
                                                                          String nomeDiretor,
                                                                          String nomePersonagem,
                                                                          String nomeAtor);
}