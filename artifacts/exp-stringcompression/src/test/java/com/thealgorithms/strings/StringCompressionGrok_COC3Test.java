package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionGrok_COC3Test {

    @Test
    public void testCompress_SingleChar() {
        String input = "a";
        String expected = "a";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_TwoSameChars() {
        String input = "aa";
        String expected = "a2";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_TwoDifferentChars() {
        String input = "ab";
        String expected = "ab";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_ThreeSameChars() {
        String input = "aaa";
        String expected = "a3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_FirstTwoSameLastDifferent() {
        String input = "aab";
        String expected = "a2b";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_TwoPairs() {
        String input = "aabb";
        String expected = "a2b2";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_AllDifferent() {
        String input = "abc";
        String expected = "abc";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_ThreeSameOneDifferent() {
        String input = "aaab";
        String expected = "a3b";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }
}
// ```