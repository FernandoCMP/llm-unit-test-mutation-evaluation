package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionGrok_COC1Test {

    @Test
    public void testCompress_SingleChar() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_AllSame() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    public void testCompress_NoRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_RepeatsThenDifferent() {
        assertEquals("a2b2", StringCompression.compress("aabb"));
    }

    @Test
    public void testCompress_RepeatsAtEnd() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    public void testCompress_DifferentAtEnd() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }
}
// ```