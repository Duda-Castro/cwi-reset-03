import br.com.cwi.reset.projeto1.Exercicios1;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios1Test {


    @Test
    public void validarSomaComListaDe5NumerosIntPos (){

        //Arrange
        List<Integer> lista = Arrays.asList (5,6,8,6,9);
        Integer expected = 34;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);


    }
    @Test
    public void validarSomaComListaDe5Numeros4Int1Neg (){

        //Arrange
        List<Integer> lista = Arrays.asList (5,6,8,6,-9);
        Integer expected = 16;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaDe3ElemNeg (){

        //Arrange
        List<Integer> lista = Arrays.asList (-5,-8,-9);
        Integer expected = -22;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaDeTodosZero (){

        //Arrange
        List<Integer> lista = Arrays.asList (0,0,0,0);
        Integer expected = 0;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaVazia (){

        //Arrange
        List<Integer> lista = Arrays.asList ();
        Integer expected = 0;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }

    @Test
    public void validarSomaComListaDe5NumerosIntPosMedia (){

        //Arrange
        List<Integer> lista = Arrays.asList (5,6,8,6,9);
        Integer expected = 6;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.calcularMedia(lista);
        //Assert
        Assert.assertEquals(expected,soma);


    }
    @Test
    public void validarSomaComListaDe5Numeros4Int1NegMedia (){

        //Arrange
        List<Integer> lista = Arrays.asList (5,6,8,6,-9);
        Integer expected = 3;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.calcularMedia(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaDe3ElemNegMedia (){

        //Arrange
        List<Integer> lista = Arrays.asList (-5,-8,-9);
        Integer expected = -7;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.calcularMedia(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaDeTodosZeroMedia (){

        //Arrange
        List<Integer> lista = Arrays.asList (0,0,0,0);
        Integer expected = 0;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.calcularMedia(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }
    @Test
    public void validarSomaComListaVaziaMedia (){

        //Arrange
        List<Integer> lista = Arrays.asList ();
        Integer expected = 0;
        //Act
        Exercicios1 teste = new Exercicios1();
        Integer soma = teste.somarLista(lista);
        //Assert
        Assert.assertEquals(expected,soma);

    }

    @Test
    public void inverterAbacate (){

        //Arrange
        String palavra = "abacate";
        String expected = "etacaba";
        //Act
        Exercicios1 teste = new Exercicios1();
        String testando = teste.obterPalavraInvertida(palavra);
        //Assert
        Assert.assertEquals(expected,testando);

    }
    @Test
    public void inverterBanana (){

        //Arrange
        String palavra = "banana";
        String expected = "ananab";
        //Act
        Exercicios1 teste = new Exercicios1();
        String testando = teste.obterPalavraInvertida(palavra);
        //Assert
        Assert.assertEquals(expected,testando);

    }
    @Test
    public void inverterPessego (){

        //Arrange
        String palavra = "pessego";
        String expected = "ogessep";
        //Act
        Exercicios1 teste = new Exercicios1();
        String testando = teste.obterPalavraInvertida(palavra);
        //Assert
        Assert.assertEquals(expected,testando);

    }
    @Test
    public void inverterMorango (){

        //Arrange
        String palavra = "morango";
        String expected = "ognarom";
        //Act
        Exercicios1 teste = new Exercicios1();
        String testando = teste.obterPalavraInvertida(palavra);
        //Assert
        Assert.assertEquals(expected,testando);

    }


    @Test
    public void validarNumerosEmSequencia (){

        //Arrange
        List<Integer> lista = Arrays.asList (5,6,8,9,5,4,6,8,4,6,8,2);
        List<Integer> expected = Arrays.asList(2,4,4,5,5,6,6,6,8,8,8,9);
        //Act
        Exercicios1 teste = new Exercicios1();
        List<Integer> ordenar = teste.ordenarLista(lista);
        //Assert
        Assert.assertEquals(expected,ordenar);

    }

    @Test
    public void validarNumerosNegativosEmSequencia (){

        //Arrange
        List<Integer> lista = Arrays.asList (-5,-6,-8,-9,-5,-4,-6,-8,-4,-6,-8,-2);
        List<Integer> expected = Arrays.asList(-9,-8,-8,-8,-6,-6,-6,-5,-5,-4,-4,-2);
        //Act
        Exercicios1 teste = new Exercicios1();
        List<Integer> ordenar = teste.ordenarLista(lista);
        //Assert
        Assert.assertEquals(expected,ordenar);

    }

    @Test
    public void validarNumerosNegativosEPositivosEmSequencia (){

        //Arrange
        List<Integer> lista = Arrays.asList (-5,6,-8,-9,-5,-4,-6,8,-4,-6,-8,2);
        List<Integer> expected = Arrays.asList(-9,-8,-8,-6,-6,-5,-5,-4,-4,2,6,8);
        //Act
        Exercicios1 teste = new Exercicios1();
        List<Integer> ordenar = teste.ordenarLista(lista);
        //Assert
        Assert.assertEquals(expected,ordenar);

    }

    @Test
    public void validarNumerosListaVaziaExceptionEmSequencia (){

        //Arrange
        List<Integer> lista = Arrays.asList ();
        boolean expected = false;
        if(lista.isEmpty()){
            expected = true;
        }
        //Act
        Exercicios1 teste = new Exercicios1();
        List<Integer> ordenar = teste.ordenarLista(lista);
        //Assert
        Assert.assertEquals(expected,ordenar.isEmpty());

    }


}
