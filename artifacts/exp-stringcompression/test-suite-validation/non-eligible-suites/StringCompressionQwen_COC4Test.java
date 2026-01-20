package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionQwen_COC4Test {

    @Test
    public void testCompress_singleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_allSameCharacters() {
        assertEquals("a4", StringCompression.compress("aaaa"));
    }

    @Test
    public void testCompress_noConsecutiveRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_mixedRepeats() {
        assertEquals("a3b2c1d2", StringCompression.compress("aaabbccdd"));
    }

    @Test
    public void testCompress_twoCharactersSame() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    public void testCompress_twoCharactersDifferent() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    public void testCompress_endWithRepeat() {
        assertEquals("a2b2", StringCompression.compress("aabb"));
    }

    @Test
    public void testCompress_endWithoutRepeat() {
        assertEquals("a2bc", StringCompression.compress("aabc"));
    }
}
// ```