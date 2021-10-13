package br.com.cwi.reset.dudacastro;

public class AtorService {


    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    // Demais métodos da classe



    public void criarAtor(AtorRequest atorRequest){

    fakeDatabase.persisteAtor(atorRequest);



    }

}
