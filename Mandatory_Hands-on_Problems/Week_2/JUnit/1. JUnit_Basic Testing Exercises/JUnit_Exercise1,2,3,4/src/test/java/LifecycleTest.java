import org.junit.*;
import static org.junit.Assert.*;

public class LifecycleTest {
    private Calculator calc;

    @Before
    public void setup(){
        calc = new Calculator();
        System.out.println("Before each test");
    }

    @After
    public void tearDown(){
        System.out.println("After each test");
    }

    @Test
    public void testAddition_AAA(){
        int result = calc.add(10,20);
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication_AAA(){
        int result = calc.multiply(5,2);
        assertEquals(10, result);
    }

}
