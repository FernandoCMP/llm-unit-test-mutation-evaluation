package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_FS4Test {

  @Test
  void testCompress_SingleCharacter() {
      assertEquals("a", StringCompression.compress("a"));
  }

  @Test
  void testCompress_RepeatedCharacters() {
      assertEquals("a3", StringCompression.compress("aaa"));
  }

  @Test
  void testCompress_MixedCharacters() {
      assertEquals("a2b", StringCompression.compress("aab"));
  }

  @Test
  void testCompress_AllDifferent() {
      assertEquals("abc", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_TwoSame() {
      assertEquals("a2", StringCompression.compress("aa"));
  }

  @Test
  void testCompress_TwoDifferent() {
      assertEquals("ab", StringCompression.compress("ab"));
  }

  @Test
  void testCompress_LastRepeated() {
      assertEquals("a3b2", StringCompression.compress("aaabb"));
  }

  @Test
  void testCompress_LastSingle() {
      assertEquals("a3b", StringCompression.compress("aaab"));
  }

  @Test
  void testCompress_MultipleGroups() {
      assertEquals("a2b2c2", StringCompression.compress("aabbcc"));
  }

  @Test
  void testCompress_EmptyString() {
      assertEquals("", StringCompression.compress(""));
  }

  @Test
  void testCompress_WithSpaces() {
      assertEquals("a2 b2", StringCompression.compress("aa bb"));
  }

  @Test
  void testCompress_WithNumbers() {
      assertEquals("13", StringCompression.compress("111"));
  }
}
