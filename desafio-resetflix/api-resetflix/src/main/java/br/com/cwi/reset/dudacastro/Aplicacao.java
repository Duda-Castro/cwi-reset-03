package br.com.cwi.reset.dudacastro;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.time.LocalDateTime;
import java.time.Period;

public class Aplicacao {

    public static void main(String[] args) {
        FakeDatabase fakeDatabase = new FakeDatabase();

        String campo;
        AtorService atorService = new AtorService(fakeDatabase);


        String nome = "Will Smith";
        LocalDate dataNascimento = LocalDate.of(1996, Month.SEPTEMBER, 25);
        StatusCarreira statusCarreira = StatusCarreira.EM_ATIVIDADE;
        Integer anoInicioAtividade = 2002;

        AtorRequest atorRequest = new AtorRequest(nome, dataNascimento, statusCarreira, anoInicioAtividade);

        try {
            String[] split = atorRequest.getNome().split(" ");
            if (atorRequest.getNome() == null || Objects.equals(atorRequest.getNome(), "")) {
                campo = "nome";
                throw new CampoObrigatorioNaoInformadoException(campo);
            } else if (atorRequest.getDataNascimento() == null) {
                campo = "DataNascimento";
                throw new CampoObrigatorioNaoInformadoException(campo);
            }else if (atorRequest.getStatusCarreira() == null) {
                campo = "StatusCarreira";
                throw new CampoObrigatorioNaoInformadoException(campo);
            }else if (atorRequest.getAnoInicioAtividade() == null) {
                campo = "AnoInicioAtividade";
                throw new CampoObrigatorioNaoInformadoException(campo);
            }else if (split.length < 2) {
                campo = "nome";
                throw new DeveSerInformadoPeloMenosNomeESobrenome(campo);
            }else if (Period.between(atorRequest.getDataNascimento(),LocalDate.now()).getDays() < 1) {
                campo = "atores";
                throw new NaoNascidos(campo);
            }else if (atorRequest.getDataNascimento().getYear() > atorRequest.getAnoInicioAtividade()) {

                throw new AnoDeAtividadeInvalido();
            }else{
                campo = "ator";
                String name;
                List<Ator> array = fakeDatabase.recuperaAtores();

                for (Integer i=0; i<fakeDatabase.recuperaAtores().size();i++){
                    for (Integer g=0; g<fakeDatabase.recuperaAtores().size();g++) {
                        if (array.toArray()[i] == array.toArray()[g]){
                            name = array.toArray()[i].toString();
                            throw new NomeIgual(campo,name);
                        }

                    }
                }


            }
                atorService.criarAtor(atorRequest);

                List<Ator> atores = fakeDatabase.recuperaAtores();

                System.out.println("Deve conter 1 ator, quantidade encontrada: " + atores.size());
                System.out.println("Primeiro ator deve ser 'Will Smith', valor encontrado: " + atores.get(0).getNome());
                atorService.listarAtoresEmAtividade("Will");


                } catch (CampoObrigatorioNaoInformadoException | DeveSerInformadoPeloMenosNomeESobrenome | NaoNascidos | AnoDeAtividadeInvalido | NomeIgual e) {
            e.printStackTrace();
        }
    }
    }




