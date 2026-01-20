package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_COC4Test {

    @Test
    void testCompress_LengthOne() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_NoRepetitions() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_RepetitionAtEnd() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_RepetitionInMiddle() {
        assertEquals("a2b2c", StringCompression.compress("aabbc"));
    }

    @Test
    void testCompress_SingleRepetition() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_AllDifferent() {
        assertEquals("abcd", StringCompression.compress("abcd"));
    }

    @Test
    void testCompress_RepetitionThenDifferent() {
        assertEquals("a2bc", StringCompression.compress("aabc"));
    }

    @Test
    void testCompress_DifferentThenRepetition() {
        assertEquals("ab2c", StringCompression.compress("abbc"));
    }

    @Test
    void testCompress_MultipleGroups() {
        assertEquals("a2b3c2", StringCompression.compress("aabbbcc"));
    }
}
// ```