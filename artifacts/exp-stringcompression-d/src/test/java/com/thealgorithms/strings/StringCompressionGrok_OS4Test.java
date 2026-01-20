package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_OS4Test {

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
    void testCompress_NoRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_AllSame() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_MixedRepeats() {
        assertEquals("a3b3", StringCompression.compress("aaabbb"));
    }

    @Test
    void testCompress_WithSingles() {
        assertEquals("a2b2c", StringCompression.compress("aabbc"));
    }

    @Test
    void testCompress_EndWithSingle() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_StartWithSingle() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    void testCompress_LongerString() {
        assertEquals("a2b3c2d", StringCompression.compress("aabbbccd"));
    }
}
// ```