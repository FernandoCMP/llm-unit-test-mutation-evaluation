package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_FS5Test {

    @Test
    void testCompress_emptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_singleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_twoSameCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_multipleSameCharacters() {
        assertEquals("a4", StringCompression.compress("aaaa"));
    }

    @Test
    void testCompress_mixedRepeatedAndSingle() {
        assertEquals("a3b2c", StringCompression.compress("aaabbc"));
    }

    @Test
    void testCompress_noRepetition() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_complexPattern() {
        assertEquals("a2b1c3d1e2", StringCompression.compress("aabcccdee"));
    }

    @Test
    void testCompress_allSameCharacters() {
        assertEquals("a6", StringCompression.compress("aaaaaa"));
    }

    @Test
    void testCompress_alternatingPattern() {
        assertEquals("a1b1a1b1", StringCompression.compress("abab"));
    }

    @Test
    void testCompress_longRepetitionAtEnd() {
        assertEquals("a1b6", StringCompression.compress("abbbbbb"));
    }
}
// ```