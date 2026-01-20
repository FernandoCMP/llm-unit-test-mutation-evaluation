package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_FS2Test {

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_TwoIdenticalCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    void testCompress_ThreeIdenticalCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_AllIdenticalCharacters() {
        assertEquals("b4", StringCompression.compress("bbbb"));
    }

    @Test
    void testCompress_TwoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_MixedCharacters() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    void testCompress_MultipleGroups() {
        assertEquals("a2b2c", StringCompression.compress("aabbc"));
    }

    @Test
    void testCompress_LastCharacterDifferent() {
        assertEquals("a3b", StringCompression.compress("aaab"));
    }

    @Test
    void testCompress_NoCompressionNeeded() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    void testCompress_SingleGroupAtEnd() {
        assertEquals("a2bc", StringCompression.compress("aabc"));
    }
}
// ```