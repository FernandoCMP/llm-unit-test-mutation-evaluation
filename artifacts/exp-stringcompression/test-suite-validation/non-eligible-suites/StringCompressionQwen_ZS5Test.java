package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionQwen_ZS5Test {

    @Test
    public void testCompress_singleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompress_twoSameCharacters() {
        assertEquals("a2", StringCompression.compress("aa"));
    }

    @Test
    public void testCompress_twoDifferentCharacters() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    public void testCompress_threeSameCharacters() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    public void testCompress_mixedRepeatingAndNonRepeating() {
        assertEquals("a3bc2d", StringCompression.compress("aaabcccd"));
    }

    @Test
    public void testCompress_noRepetition() {
        assertEquals("abcd", StringCompression.compress("abcd"));
    }

    @Test
    public void testCompress_allSameCharacters() {
        assertEquals("a5", StringCompression.compress("aaaaa"));
    }

    @Test
    public void testCompress_complexCase() {
        assertEquals("a2b3cdef2", StringCompression.compress("aabbbcdeff"));
    }

    @Test
    public void testCompress_singleCharacterAtEnd() {
        assertEquals("a2b", StringCompression.compress("aab"));
    }

    @Test
    public void testCompress_emptyString() {
        assertEquals("", StringCompression.compress(""));
    }
}
// ```