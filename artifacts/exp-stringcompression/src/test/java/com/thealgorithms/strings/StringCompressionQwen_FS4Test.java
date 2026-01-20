package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_FS4Test {

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_TwoSameCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_MultipleSameCharacters() {
        assertEquals("a4", StringCompression.compress("aaaa"));
    }

    @Test
    void testCompress_TwoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_ThreeCharactersWithRepetition() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    void testCompress_ComplexRepeatingPattern() {
        assertEquals("a3b2c4d", StringCompression.compress("aaabbccccd"));
    }

    @Test
    void testCompress_AllSameCharacters() {
        assertEquals("a6", StringCompression.compress("aaaaaa"));
    }

    @Test
    void testCompress_NoRepetitionLongString() {
        assertEquals("abcdef", StringCompression.compress("abcdef"));
    }

    @Test
    void testCompress_EndingWithRepetition() {
        assertEquals("ab2c3", StringCompression.compress("abbccc"));
    }
}
// ```