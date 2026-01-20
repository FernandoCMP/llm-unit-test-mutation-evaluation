package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionQwen_ZS4Test {

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
    public void testCompress_mixedCharactersNoRepetition() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_repeatedAndNonRepeatedMix() {
        assertEquals("a2bc2d", StringCompression.compress("aabbcccd"));
    }

    @Test
    public void testCompress_longRepetition() {
        assertEquals("a10", StringCompression.compress("aaaaaaaaaa"));
    }

    @Test
    public void testCompress_complexCase() {
        assertEquals("a3b2c1d4", StringCompression.compress("aaabbccdddd"));
    }

    @Test
    public void testCompress_emptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    public void testCompress_singleRepeatAtEnd() {
        assertEquals("ab2", StringCompression.compress("abb"));
    }
}
// ```