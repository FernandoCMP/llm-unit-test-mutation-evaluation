package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_OS5Test {

    @Test
    void testCompress_SingleChar() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_AllSame() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_NoRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_MultipleGroups() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    void testCompress_GroupAtEnd() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_SingleAtEnd() {
        assertEquals("a2b2c", StringCompression.compress("aabbc"));
    }

    @Test
    void testCompress_TwoSame() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_TwoDifferent() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_LongerString() {
        assertEquals("a4b3c1d2", StringCompression.compress("aaaabbbcd"));
    }

    @Test
    void testCompress_WithNumbers() {
        assertEquals("1a2b3", StringCompression.compress("1aabbb"));
    }
}
// ```