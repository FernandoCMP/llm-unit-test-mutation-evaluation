package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionQwen_COC5Test {

    @Test
    public void testCompress_singleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_allSameCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    public void testCompress_mixedRepeatingAndNonRepeating() {
        assertEquals("a3b1c2", StringCompression.compress("aaabcc"));
    }

    @Test
    public void testCompress_noRepetition() {
        assertEquals("a1b1c1", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_endsWithRepetition() {
        assertEquals("a1b2", StringCompression.compress("abb"));
    }

    @Test
    public void testCompress_longRepetition() {
        assertEquals("a1b5", StringCompression.compress("abbbbb"));
    }
}
// ```