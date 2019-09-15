import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test focused around testing of functionality of FibonacciSequenceGenerator.
 */

public class FibonacciSequenceGeneratorTest {

    private static FibonacciSequenceGenerator fibonacciSequenceGenerator = null;

    @BeforeClass
    public static void setupBeforeTests() {
        fibonacciSequenceGenerator = new FibonacciSequenceGenerator();
    }

    @Test
    public void testBoundaryConditionAtStart() {
        assertEquals(fibonacciSequenceGenerator.generateFibonacciNumber(0), 0);
        assertEquals(fibonacciSequenceGenerator.generateFibonacciNumber(1), 1);
    }

    @Test(expected = StackOverflowError.class)
    public void testBoundaryConditionAtEnd() {
        fibonacciSequenceGenerator.generateFibonacciNumber(922337203);
    }


    @Test
    public void testPositiveScenarios() {
        assertEquals(fibonacciSequenceGenerator.generateFibonacciNumber(5), 5);
        assertEquals(fibonacciSequenceGenerator.generateFibonacciNumber(14), 377);
        assertEquals(fibonacciSequenceGenerator.generateFibonacciNumber(18), 2584);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testExpectedIllegalArgumentException() {
        fibonacciSequenceGenerator.generateFibonacciNumber(-1);
    }
}
