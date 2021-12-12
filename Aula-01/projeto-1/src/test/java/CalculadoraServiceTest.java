import br.com.cwi.reset.projeto1.CalculadoraService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    public void quandoMultiplicarDoisNumerosInteirosPositivosDeveRetornarSuaMultiplicacao() {
        // Arrange
        Integer numeroUm = 2;
        Integer numeroDois = 3;
        Integer resultadoEsperado = 6;

        // Action
        Integer resultado = service.multiplicar(numeroUm, numeroDois);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultado, "O valor esperado deveria ser " + resultadoEsperado + " obtemos o resultado " + resultado);
    }

    @Test
    public void quandoMultiplicarDoisNumerosNegativosDeveRetornarAMultiplicacaoPositiva() {
        // Arrange
        Integer numeroUm = -8;
        Integer numeroDois = -8;
        Integer resultadoEsperado = 64;

        // Action
        Integer resultado = service.multiplicar(numeroUm, numeroDois);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void quandoMultiplicarUmNumeroNegativoPorUmNumeroPositivoDeveRetornarAMultiplicacaoNegativa() {
        // Arrange
        Integer numeroUm = -6;
        Integer numeroDois = 6;
        Integer resultadoEsperado = -36;

        // Action
        Integer resultado = service.multiplicar(numeroUm, numeroDois);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void quandoDividirUmNumeroInteiroPorZeroException() {
        // Arrange
        Integer numeroUm = 6;
        Integer numeroDois = 0;


        // Action
        // Assert
        Assertions.assertThrows(ArithmeticException.class, () -> {
            service.dividir(numeroUm, numeroDois);
        });
    }
}
