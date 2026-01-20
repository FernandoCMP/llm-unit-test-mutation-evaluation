package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_FS1Test {

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
    void testCompress_TwoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_RepeatedAtStart() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_RepeatedAtEnd() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_Mixed() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    void testCompress_AllDifferent() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_LargeCount() {
        assertEquals("a10", StringCompression.compress("aaaaaaaaaa"));
    }

    @Test
    void testCompress_SingleInMiddle() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }
}
// ```