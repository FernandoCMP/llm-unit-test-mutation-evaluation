package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_ZS3Test {

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_TwoIdenticalCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_TwoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_ThreeIdenticalCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_MixedWithRepeats() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    void testCompress_MultipleGroups() {
        assertEquals("a2b2", StringCompression.compress("aabb"));
    }

    @Test
    void testCompress_AllUnique() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_LastUnique() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_LastRepeated() {
        assertEquals("a3b2", StringCompression.compress("aaabb"));
    }

    @Test
    void testCompress_SingleRepeatInMiddle() {
        assertEquals("ab2c", StringCompression.compress("abbc"));
    }

    @Test
    void testCompress_LongerSequence() {
        assertEquals("a4b3c2", StringCompression.compress("aaaabbbcc"));
    }
}
// ```