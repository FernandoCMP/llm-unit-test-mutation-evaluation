package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_FS3Test {

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
    void testCompress_ThreeSameCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_MultipleGroups() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    void testCompress_SingleAndRepeated() {
        assertEquals("a2bc3d", StringCompression.compress("aabcccdd"));
    }

    @Test
    void testCompress_NoRepetition() {
        assertEquals("abcd", StringCompression.compress("abcd"));
    }

    @Test
    void testCompress_EndingWithSingleCharacter() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_LongRepetition() {
        assertEquals("a10", StringCompression.compress("aaaaaaaaaa"));
    }

    @Test
    void testCompress_ComplexPattern() {
        assertEquals("a1b2a1b2", StringCompression.compress("abbabb"));
    }
}
// ```