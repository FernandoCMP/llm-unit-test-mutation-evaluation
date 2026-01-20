package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.thealgorithms.strings.StringCompression;

public class StringCompressionGrok_ZS2Test {

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
    public void testCompress_RepeatsAtStart() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    public void testCompress_RepeatsAtEnd() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    public void testCompress_MultipleGroups() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    public void testCompress_SingleRepeat() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    public void testCompress_Mixed() {
        assertEquals("a2b3c", StringCompression.compress("aabbbc"));
    }
}
// ```