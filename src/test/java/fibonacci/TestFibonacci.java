package fibonacci;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;


public class TestFibonacci {

    @Test(expected = IllegalArgumentException.class)
    public void testNoLenArgumentSupplied() {
        Fibonacci fibonacci = new Fibonacci("");
        String result = fibonacci.getSequence();
        assert(result.length() == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeLenArgument() {
        Fibonacci fibonacci = new Fibonacci("-3");
        String result = fibonacci.getSequence();
        assert(result.length() == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPositiveArgument() {
        Fibonacci fibonacci = new Fibonacci("+5");
        String result = fibonacci.getSequence();
        assert(result.length() == 9);
        assert(result.equals("0,1,1,2,3"));
    }

    @Test
    public void testValidArgument() {
        Fibonacci fibonacci = new Fibonacci("5");
        String result = fibonacci.getSequence();
        assert(result.length() == 9);
        assert(result.equals("0,1,1,2,3"));
    }

    @Test
    public void testNoNegativeResultsWithValidArgument() {
        Fibonacci fibonacci = new Fibonacci("500");
        String result = fibonacci.getSequence();
        assert(result.indexOf('-') == -1);
    }
}