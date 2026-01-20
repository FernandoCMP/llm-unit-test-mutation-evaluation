package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionGrok_ZS5Test {

    @Test
    public void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    public void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_NoRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_AllSame() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    public void testCompress_MixedRepeats() {
        assertEquals("a3b3", StringCompression.compress("aaabbb"));
    }

    @Test
    public void testCompress_EndsWithSingle() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    public void testCompress_StartsWithSingle() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    public void testCompress_Alternating() {
        assertEquals("abab", StringCompression.compress("abab"));
    }

    @Test
    public void testCompress_WithNumbers() {
        assertEquals("1322", StringCompression.compress("111222"));
    }

    @Test
    public void testCompress_WithSpecialChars() {
        assertEquals("!2@2", StringCompression.compress("!!@@"));
    }

    @Test
    public void testCompress_WithSpaces() {
        assertEquals("a2 b2", StringCompression.compress("aa bb"));
    }

    @Test
    public void testCompress_MultipleGroups() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    public void testCompress_LastGroupRepeated() {
        assertEquals("a3b2", StringCompression.compress("aaabb"));
    }
}
// ```