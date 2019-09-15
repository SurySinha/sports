import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test focused around testing of functionality of StringReverseUtil .
 */

public class StringReverseUtilTest {
    private static StringReverseUtil stringReverseUtil = null;

    @BeforeClass
    public static void setupBeforeTests() {
        stringReverseUtil = new StringReverseUtil();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseStringForNullString() {
        stringReverseUtil.reverseString(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseStringForEmptyString() {
        stringReverseUtil.reverseString("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPositiveScenarios() {
        assertEquals(stringReverseUtil.reverseString("a"), "a");
        assertEquals(stringReverseUtil.reverseString("ab"), "ba");
        assertEquals(stringReverseUtil.reverseString("abc"), "cba");
        assertEquals(stringReverseUtil.reverseString("abcd"), "dcba");
    }


}
