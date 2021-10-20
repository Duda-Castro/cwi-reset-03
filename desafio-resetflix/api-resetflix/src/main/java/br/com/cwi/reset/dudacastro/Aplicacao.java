package br.com.cwi.reset.dudacastro;

import br.com.cwi.reset.dudacastro.model.Ator;
import br.com.cwi.reset.dudacastro.model.StatusCarreira;
import br.com.cwi.reset.dudacastro.request.AtorRequest;
import br.com.cwi.reset.dudacastro.service.AtorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Aplicacao {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aplicacao.class, args);
    }
}




