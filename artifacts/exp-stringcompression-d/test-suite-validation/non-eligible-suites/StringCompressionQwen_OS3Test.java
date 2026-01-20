package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_OS3Test {

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
        assertEquals("a1b2", StringCompression.compress("abb"));
    }

    @Test
    void testCompress_MixedRepeats() {
        assertEquals("x1y3z1", StringCompression.compress("xyyyz"));
    }

    @Test
    void testCompress_AllSameCharacters() {
        assertEquals("k5", StringCompression.compress("kkkkk"));
    }

    @Test
    void testCompress_ComplexPattern() {
        assertEquals("h1e1l2o1w1o1r1l1d1", StringCompression.compress("hellooworld"));
    }
}
// ```