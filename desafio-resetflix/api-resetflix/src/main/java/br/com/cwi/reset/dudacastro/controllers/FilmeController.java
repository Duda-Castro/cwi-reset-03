package br.com.cwi.reset.dudacastro.controllers;

import br.com.cwi.reset.dudacastro.model.Filme;
import br.com.cwi.reset.dudacastro.request.FilmeRequest;
import br.com.cwi.reset.dudacastro.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarFilme(@RequestBody FilmeRequest filmeRequest) throws Exception {
        service.criarFilme(filmeRequest);
    }

    @GetMapping
    public List<Filme> consultarFilmes(
            @RequestParam String nomeFilme,
            @RequestParam String nomeDiretor,
            @RequestParam String nomePersonagem,
            @RequestParam String nomeAtor) throws Exception {
        return service.consultarFilmes(nomeFilme, nomeDiretor, nomePersonagem, nomeAtor);
    }
}