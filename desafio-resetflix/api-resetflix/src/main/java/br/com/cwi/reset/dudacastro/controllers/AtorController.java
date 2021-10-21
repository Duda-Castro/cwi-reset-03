package br.com.cwi.reset.dudacastro.controllers;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.exception.CampoNaoInformadoException;
import br.com.cwi.reset.dudacastro.request.AtorRequest;
import br.com.cwi.reset.dudacastro.service.AtorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atores")
public class AtorController {

    private AtorService atorService;

    public AtorController() {
        this.atorService = new AtorService(FakeDatabase.getInstance());
    }

    //demais metodos

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAtor(@RequestBody AtorRequest atorRequest) throws Exception {
        this.atorService.criarAtor(atorRequest);
        String campo;
        if(atorRequest.getNome().equals(null) || atorRequest.getNome().equals("")){
            campo = "Nome";
            throw new CampoNaoInformadoException(campo);
        }
    }
}


