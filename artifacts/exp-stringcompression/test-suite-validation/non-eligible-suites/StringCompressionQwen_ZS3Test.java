package com.thealgorithms.strings;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionQwen_ZS3Test {

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
    public void testCompress_multipleSameCharacters() {
        assertEquals("a4", StringCompression.compress("aaaa"));
    }

    @Test
    public void testCompress_mixedCharactersNoRepetition() {
        assertEquals("abc", StringCompression.compress("abc"));
    }

    @Test
    public void testCompress_mixedCharactersWithRepetition() {
        assertEquals("a2b2c", StringCompression.compress("aabbcc"));
    }

    @Test
    public void testCompress_complexRepetition() {
        assertEquals("a3b1c4", StringCompression.compress("aaabcccc"));
    }

    @Test
    public void testCompress_emptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    public void testCompress_singleCharacterRepeatedManyTimes() {
        assertEquals("z5", StringCompression.compress("zzzzz"));
    }

    @Test
    public void testCompress_alternatingPattern() {
        assertEquals("a3b3a3", StringCompression.compress("aaabbbccc"));
    }
}
// ```