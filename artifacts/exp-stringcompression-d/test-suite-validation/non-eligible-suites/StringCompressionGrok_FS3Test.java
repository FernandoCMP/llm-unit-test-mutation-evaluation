package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_FS3Test {

  @Test
  void testCompress_SingleCharacter() {
      assertEquals("a", StringCompression.compress("a"));
  }

  @Test
  void testCompress_TwoSameCharacters() {
      assertEquals("a2", StringCompression.compress("aa"));
  }

  @Test
  void testCompress_TwoDifferentCharacters() {
      assertEquals("ab", StringCompression.compress("ab"));
  }

  @Test
  void testCompress_RepeatedThenDifferent() {
      assertEquals("a2b", StringCompression.compress("aab"));
  }

  @Test
  void testCompress_AllSame() {
      assertEquals("a3", StringCompression.compress("aaa"));
  }

  @Test
  void testCompress_AllDifferent() {
      assertEquals("ab", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_EmptyString() {
      assertEquals("", StringCompression.compress(""));
  }

  @Test
  void testCompress_WithNumbers() {
      assertEquals("13", StringCompression.compress("111"));
  }

  @Test
  void testCompress_WithSpaces() {
      assertEquals("a2 b2", StringCompression.compress("aa bb"));
  }

  @Test
  void testCompress_MixedRepeats() {
      assertEquals("a2b2c", StringCompression.compress("aabbc"));
  }
}
