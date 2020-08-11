import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma() throws Exception {

        Calculadora calc = new Calculadora();
        double result = calc.somar(20, 5);
        assertEquals(25, result);

        double result2 = calc.dividir(20, 5);
        assertEquals(4, result2);

    }
}
