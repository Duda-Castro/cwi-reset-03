package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.exception.*;
import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.StatusCarreira;
import br.com.cwi.reset.dudacastro.repository.AtorRepository;
import br.com.cwi.reset.dudacastro.request.AtorRequest;
import br.com.cwi.reset.dudacastro.response.AtorEmAtividade;
import br.com.cwi.reset.dudacastro.validator.BasicInfoRequiredValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class AtorService {

    @Autowired
    private AtorRepository repository;



    public void criarAtor(AtorRequest atorRequest) throws Exception {
        new BasicInfoRequiredValidator().accept(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getAnoInicioAtividade(), TipoDominioException.ATOR);

        if (atorRequest.getStatusCarreira() == null) {
            throw new StatusCarreiraNaoInformadoException();
        }

        Ator ator = repository.findByNome(atorRequest.getNome());
        if (ator != null) {
            throw new CadastroDuplicadoException(TipoDominioException.ATOR.getSingular(), atorRequest.getNome());
        }

        List<Ator> listaTodos = (List<Ator>)repository.findAll();

        final Integer idGerado = listaTodos.size() + 1;

        final Ator atorCriado = new Ator(idGerado, atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(), atorRequest.getAnoInicioAtividade());

        repository.save(atorCriado);
    }

    public List<Ator> listarAtoresEmAtividade(String filtroNome) throws Exception {

        if (repository.findByStatusCarreira(StatusCarreira.EM_ATIVIDADE) == null) {
            throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

        List<Ator> retorno = null;

        if (filtroNome != null) {
            for (Ator ator : repository.findAllByStatusCarreira(StatusCarreira.EM_ATIVIDADE)) {
                final boolean containsFilter = ator.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));
                final boolean emAtividade = StatusCarreira.EM_ATIVIDADE.equals(ator.getStatusCarreira());
                if (containsFilter && emAtividade) {
                    retorno.add(new Ator(ator.getId(), ator.getNome(), ator.getDataNascimento()));
                }
            }
        } else {
            retorno = repository.findAllByStatusCarreira(StatusCarreira.EM_ATIVIDADE);
        }

        if (retorno.isEmpty()) {
            throw new FiltroNomeNaoEncontrado("Ator", filtroNome);
        }

        return retorno;
    }

    public Ator consultarAtor(Integer id) throws Exception {
        if (id == null) {
            throw new IdNaoInformado();
        }


        for (Ator ator : repository.findAll()) {
            if (ator.getId().equals(id)) {
                return ator;
            }
        }

        throw new ConsultaIdInvalidoException(TipoDominioException.ATOR.getSingular(), id);
    }

    public List<Ator> consultarAtores() throws Exception {

        if (repository.findAll().isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

        return repository.findAll();
    }
}
