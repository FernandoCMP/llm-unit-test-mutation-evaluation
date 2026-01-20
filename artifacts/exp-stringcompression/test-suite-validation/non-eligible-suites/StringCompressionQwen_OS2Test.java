package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_OS2Test {

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
        assertEquals("a3b2c1d4", StringCompression.compress("aaabbccdddd"));
    }

    @Test
    void testCompress_NoRepetition() {
        assertEquals("abcd", StringCompression.compress("abcd"));
    }

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_SingleRepeatAtEnd() {
        assertEquals("a1b1c3", StringCompression.compress("abcbbccc"));
    }

    @Test
    void testCompress_ComplexPattern() {
        assertEquals("x1y3z1a2", StringCompression.compress("xyyyzaazz"));
    }

    @Test
    void testCompress_AllSameCharacters() {
        assertEquals("a5", StringCompression.compress("aaaaa"));
    }

    @Test
    void testCompress_AlternatingPattern() {
        assertEquals("a1b1a1b1", StringCompression.compress("abab"));
    }
}
// ```