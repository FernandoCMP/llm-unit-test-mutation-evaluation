package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionLlama_FS5Test {

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_TwoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_TwoSameCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_MultipleDifferentCharacters() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_MultipleSameCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_MixedCharacters() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    void testCompress_MixedCharactersWithCountGreaterThanOneAtTheEnd() {
        assertEquals("aba2", StringCompression.compress("abaa"));
    }

    @Test
    void testCompress_LongSequence() {
        assertEquals("a10", StringCompression.compress("aaaaaaaaaa"));
    }

    @Test
    void testCompress_AlternatingCharacters() {
        assertEquals("abab", StringCompression.compress("abab"));
    }
}
// ```