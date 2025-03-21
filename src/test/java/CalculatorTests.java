import com.generation.operations.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    @Test
    @DisplayName("2+2 = 4")
    void addNumbers(){
        Calculator calculator = new Calculator();
        //1. primer argumento el resultado esperado,
        // 2. segundo argumento la llamada al metodo, 3. descripcion
        assertEquals(4,calculator.add(2,2),"probando que 2 + 2 =  4");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "3, 2, 5",
            "7, 12, 19",
            "21, 23, 44",
            "17, 15, 30"
    })
    void addNumbers2(int first, int second, int resultadoEsperado){
        Calculator calculator = new Calculator();
        assertEquals(resultadoEsperado, calculator.add(first, second),() -> first + " + " + " deberia ser"
                + resultadoEsperado);
    }

    @Test
    void divedeNumbers(){
        Calculator calculator = new Calculator();
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {int result = 1/0;});
        assertEquals("/ by zero", exception.getMessage());
    }



}
