package br.com.cwi.reset.dudacastro.controllers;

import br.com.cwi.reset.dudacastro.FakeDatabase;
import br.com.cwi.reset.dudacastro.service.AtorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    private AtorService atorService;

    public DiretorController() {
        this.atorService = new AtorService(FakeDatabase.getInstance());
    }

    //demais métodos
}
