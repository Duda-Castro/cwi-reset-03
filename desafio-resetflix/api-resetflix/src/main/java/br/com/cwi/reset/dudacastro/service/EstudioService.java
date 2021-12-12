package br.com.cwi.reset.dudacastro.service;

import br.com.cwi.reset.dudacastro.exception.CampoNaoInformadoException;
import br.com.cwi.reset.dudacastro.model.Estudio;
import br.com.cwi.reset.dudacastro.repository.AtorRepository;
import br.com.cwi.reset.dudacastro.repository.EstudioRepository;
import br.com.cwi.reset.dudacastro.request.EstudioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudioService {
    @Autowired
    private EstudioRepository repository;



    public void criarEstudio(EstudioRequest estudioRequest) throws Exception {
        Estudio estudioCriado = new Estudio(estudioRequest.getNome(),estudioRequest.getDescricao(),estudioRequest.getDataCriacao(),estudioRequest.getStatusAtividade());
        repository.save(estudioCriado);
        List<Estudio> estudios = (List<Estudio>) repository.findAll();
        if(estudios.isEmpty()){
            throw new CampoNaoInformadoException("repositório vazio");
        }

    }

    public List<Estudio> consultarEstudios(String filtroNome) throws Exception {
        List<Estudio> estudios = (List<Estudio>) repository.findAll();
        if(estudios.isEmpty()){
            throw new CampoNaoInformadoException("repositório vazio");
        }
        return repository.getByNome(filtroNome);
    }

    public Estudio consultarEstudio(Integer id) throws Exception {
        List<Estudio> estudios = (List<Estudio>) repository.findAll();
        if(estudios.isEmpty()){
            throw new CampoNaoInformadoException("repositório vazio");
        }
        return repository.getById(id);
    }
}