package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.exception.*;
import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.Diretor;
import br.com.cwi.reset.dudacastro.model.StatusCarreira;
import br.com.cwi.reset.dudacastro.repository.AtorRepository;
import br.com.cwi.reset.dudacastro.repository.DiretorRepository;
import br.com.cwi.reset.dudacastro.request.DiretorRequest;
import br.com.cwi.reset.dudacastro.validator.BasicInfoRequiredValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepository repository;

    public void criarDiretor(final DiretorRequest diretorRequest) throws Exception {
        new BasicInfoRequiredValidator().accept(diretorRequest.getNome(), diretorRequest.getDataNascimento(), diretorRequest.getAnoInicioAtividade(), TipoDominioException.DIRETOR);

        for (Diretor diretorCadastrado : repository.findAll()) {
            if (diretorCadastrado.getNome().equalsIgnoreCase(diretorRequest.getNome())) {
                throw new CadastroDuplicadoException(TipoDominioException.DIRETOR.getSingular(), diretorRequest.getNome());
            }
        }

        List<Diretor> listaTodos = (List<Diretor>)repository.findAll();

        final Integer idGerado = listaTodos.size() + 1;

        final Diretor diretorCriado = new Diretor(idGerado, diretorRequest.getNome(), diretorRequest.getDataNascimento(), diretorRequest.getAnoInicioAtividade());

        repository.save(diretorCriado);
    }

    public List<Diretor> listarDiretores(String filtroNome) throws Exception {

        if (repository.findAll().isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.DIRETOR.getSingular(), TipoDominioException.DIRETOR.getPlural());
        }

        List<Diretor> retorno = null;

        if (filtroNome != null) {
            for (Diretor diretor : repository.findAll()) {
                final boolean containsFilter = diretor.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));

                if (containsFilter) {
                    retorno.add(new Diretor(diretor.getId(), diretor.getNome(), diretor.getDataNascimento(),diretor.getAnoInicioAtividade()));
                }
            }
        } else {
            retorno = repository.findAll();
        }

        if (retorno.isEmpty()) {
            throw new FiltroNomeNaoEncontrado("Diretor", filtroNome);
        }

        return retorno;
    }

    public Diretor consultarDiretor(final Integer id) throws Exception {
        if (id == null) {
            throw new IdNaoInformado();
        }


        for (Diretor diretor : repository.findAll()) {
            if (diretor.getId().equals(id)) {
                return diretor;
            }
        }

        throw new ConsultaIdInvalidoException(TipoDominioException.DIRETOR.getSingular(), id);
    }
}
