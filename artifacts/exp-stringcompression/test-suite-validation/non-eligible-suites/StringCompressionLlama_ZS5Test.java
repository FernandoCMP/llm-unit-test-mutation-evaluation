package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionLlama_ZS5Test {

    @Test
    public void testCompress_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_NoRepeatingCharacters() {
        String input = "abcd";
        String expected = "abcd";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_RepeatingCharacters() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_MixedRepeatingAndNonRepeatingCharacters() {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_TwoCharacters() {
        String input = "aa";
        String expected = "a2";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_EmptyString() {
        String input = "";
        String expected = "";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }
}
// ```