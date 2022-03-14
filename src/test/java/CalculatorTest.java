import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(2, calculator.add(1,1));
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void subtract(){
        assertEquals(0, calculator.subtract(1,1));
        assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void multiply(){
        assertEquals(4, calculator.multiply(2,2));
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void divide(){
        assertEquals(2.0, calculator.divide(4.0,2.0), 0.01);
        assertEquals(4.0, calculator.divide(8.0,2.0), 0.01);
        assertEquals(1.3, calculator.divide(4.0,3.0), 0.1);
    }

}
