package com.thealgorithms.strings;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionLlama_OS5Test {

    @Test
    void testCompress_SingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    void testCompress_NoCompression() {
        assertEquals("ab", StringCompression.compress("ab"));
    }

    @Test
    void testCompress_Compressed() {
        assertEquals("a3", StringCompression.compress("aaa"));
    }

    @Test
    void testCompress_MultipleSequences() {
        assertEquals("a3b2c1", StringCompression.compress("aaabbc"));
    }

    @Test
    void testCompress_LastCharacterRepeated() {
        assertEquals("a2b3", StringCompression.compress("aabbb"));
    }

    @Test
    void testCompress_LastCharacterNotRepeated() {
        assertEquals("a2b1c1", StringCompression.compress("aabc"));
    }

    @Test
    void testCompress_EmptyString() {
        assertEquals("", StringCompression.compress(""));
    }
}
// ```