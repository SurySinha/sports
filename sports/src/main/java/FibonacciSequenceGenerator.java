/**
 * FibonacciSequenceGenerator has functionality to generate Fibonacci number for the index
 * provided in Fibonacci Number series .
 */

public class FibonacciSequenceGenerator {

    /**
     * This method accepts the index value of number in Fibonacci number series and computes the value of Fibonacci
     * number at the index and returns back the number.
     *
     * @param index represents the index in Fibonacci Number series
     * @return Fibonacci number present at the index
     */

    public long generateFibonacciNumber(long index) {

        /**
         * index should be greater then 0 , else throw an IllegalArgumentException.
         */
        if (index < 0) {
            throw new IllegalArgumentException("Input should be greater then 0");
        }

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return generateFibonacciNumber(index - 1) + generateFibonacciNumber(index - 2);
        }
    }
}
