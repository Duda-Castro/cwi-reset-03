package br.com.cwi.reset.primeiroprojetospring;

import br.com.cwi.reset.primeiroprojetospring.domain.Diretor;
import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/filme")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();



    private Filme buscarPeloNome (String nome){

        for(Filme filme: filmes){
        if(filme.getNome().equals(nome)){

    return filme;
}

        }

return null;
    }

    @PostMapping()
    public ResponseEntity<Object> adicionaFilme(@RequestBody Filme filmeRequest){


        Filme filmeExistente = buscarPeloNome(filmeRequest.getNome());

        if(filmeExistente != null){
        return ResponseEntity.badRequest().build();

        }
        this.filmes.add(filmeRequest);


        return ResponseEntity.ok(filmeRequest);
    }

    @GetMapping()
    public List <Filme>  retornaFilmes(){


        return filmes;
    }

    @GetMapping("/{nome}")
    public Filme filtroNome(@PathVariable String nome){

        return buscarPeloNome(nome);
    }

    @DeleteMapping("/{nome}")
    public void remocaoFilme (@PathVariable String nome) {

        Filme filme = buscarPeloNome(nome);
        if (filme != null) {

            filmes.remove(filme);
        }

    }



    @PutMapping()
    public Filme sobrescrever(@RequestBody Filme filmeAtualizacao){

        Filme filmeExistente = buscarPeloNome(filmeAtualizacao.getNome());
        if(filmeExistente != null){

            filmes.remove(filmeExistente);
            filmes.add(filmeAtualizacao);
            return filmeAtualizacao;
        }





return null;

    }

}

