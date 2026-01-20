package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_OS1Test {

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_AllSameCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_NoRepeats() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_MixedRepeats() {
        assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
    }

    @Test
    void testCompress_RepeatsAtStart() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_RepeatsAtEnd() {
        assertEquals("ab3", StringCompression.compress("abbb"));
    }

    @Test
    void testCompress_SingleRepeat() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_LongerRepeats() {
        assertEquals("a4b2", StringCompression.compress("aaaabb"));
    }

    @Test
    void testCompress_TwoDifferent() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }
}
// ```