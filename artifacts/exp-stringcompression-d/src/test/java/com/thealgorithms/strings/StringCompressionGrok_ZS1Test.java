package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionGrok_ZS1Test {

    @Test
    void testCompress_emptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_singleChar() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_noRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_twoRepeats() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_threeRepeats() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_multipleGroups() {
        assertEquals("a2b2", StringCompression.compress("aabb"));
    }

    @Test
    void testCompress_mixed() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_lastGroupSingle() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    void testCompress_allSame() {
        assertEquals("a4", StringCompression.compress("aaaa"));
    }

    @Test
    void testCompress_longer() {
        assertEquals("a3b3c2", StringCompression.compress("aaabbbcc"));
    }
}
// ```