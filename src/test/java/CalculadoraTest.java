import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    static void init() {
        calculadora = new Calculadora();
        System.out.println("init");
    }

    @Test
    void soma_test_ok() {
        double resultado = calculadora.soma(10, 10);
        Assertions.assertEquals(20, resultado);
    }

    @Test
    void multiplica_test_ok() {
        double resultado = calculadora.multiplica(10, 10);
        Assertions.assertEquals(100, resultado);
    }

    @Test
    void divide_test_ok() {
        double resultado = calculadora.divide(10, 10);
        Assertions.assertEquals(1, resultado);
    }

    @Test
    void subtrai_test_ok() {
        double resultado = calculadora.subtrai(10, 10);
        Assertions.assertEquals(0, resultado);
    }

    @Test
    void divisao_por_zero() {

        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            double resultado = calculadora.divide(10, 0);
        });

        Assertions.assertEquals("Nao pode dividir por zero.", exception.getMessage());

    }


}
