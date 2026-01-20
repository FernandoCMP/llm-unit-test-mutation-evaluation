package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionLlama_ZS3Test {

    @Test
    public void testCompress_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_NoRepeatedCharacters() {
        String input = "abcd";
        String expected = "abcd";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_WithRepeatedCharacters() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_WithSingleRepeatedCharacter() {
        String input = "aaa";
        String expected = "a3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_WithTrailingRepeatedCharacters() {
        String input = "abbb";
        String expected = "ab3";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_WithLeadingRepeatedCharacters() {
        String input = "aaab";
        String expected = "a3b";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompress_WithEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringCompression.compress(input);
        assertEquals(expected, actual);
    }
}
// ```