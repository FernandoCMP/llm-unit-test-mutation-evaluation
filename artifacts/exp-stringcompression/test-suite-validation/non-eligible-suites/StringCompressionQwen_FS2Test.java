package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_FS2Test {

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
        assertEquals("a3b2c", StringCompression.compress("aaabbc"));
    }

    @Test
    void testCompress_NoRepetition() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_EndingWithRepetition() {
        assertEquals("ab2c3", StringCompression.compress("abbccc"));
    }

    @Test
    void testCompress_StartsWithRepetition() {
        assertEquals("a2bc", StringCompression.compress("aabc"));
    }

    @Test
    void testCompress_AllSameCharacters() {
        assertEquals("a5", StringCompression.compress("aaaaa"));
    }

    @Test
    void testCompress_ComplexPattern() {
        assertEquals("a2b1c2d3e1f", StringCompression.compress("aabcccddeef"));
    }
}
// ```