package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionLlama_ZS1Test {

    @Test
    public void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_NoRepeatingCharacters() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_RepeatingCharacters() {
        assertEquals("a3b2c", StringCompression.compress("aaabbcc"));
    }

    @Test
    public void testCompress_RepeatingCharactersAtEnd() {
        assertEquals("a3b2c3", StringCompression.compress("aaabbccc"));
    }

    @Test
    public void testCompress_SingleRepeatingCharacter() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    public void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }
}
// ```