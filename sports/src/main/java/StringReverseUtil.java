/**
 * StringReverseUtil has functionality to reverse a String.
 */
public class StringReverseUtil {

    /**
     * This method sends reverse value of input string.
     *
     * @param inputString inputString string which needs to be reversed
     * @return reversed value of input string.
     */

    public String reverseString(String inputString) {

        /**
         * inputString should not be empty or null , else throw an IllegalArgumentException.
         */

        if (null == inputString || inputString.length() < 1) {
            throw new IllegalArgumentException("Input string should be non empty");
        }

        //Recursive call
        return reverseString(inputString.substring(1)) + inputString.charAt(0);
    }
}
