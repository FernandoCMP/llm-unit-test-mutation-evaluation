package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_FS5Test {

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
  void testCompress_MixedGroups() {
      assertEquals("a2b2", StringCompression.compress("aabb"));
  }

  @Test
  void testCompress_SingleAtEnd() {
      assertEquals("a3b", StringCompression.compress("aaab"));
  }

  @Test
  void testCompress_AllDifferent() {
      assertEquals("abc", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_LastGroupMultiple() {
      assertEquals("ab3", StringCompression.compress("abbb"));
  }

  @Test
  void testCompress_Alternating() {
      assertEquals("aba", StringCompression.compress("aba"));
  }

  @Test
  void testCompress_LongerMixed() {
      assertEquals("a2bc2", StringCompression.compress("aabbcc"));
  }
}
