import com.generation.operations.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    @DisplayName("2+2 = 4")
    void addNumbers(){
        Calculator calculator = new Calculator();
        //1. primer argumento el resultado esperado,
        // 2. segundo argumento la llamada al metodo, 3. descripcion
        assertEquals(4,calculator.add(2,2),"probando que 2 + 2 =  4");
    }

}
