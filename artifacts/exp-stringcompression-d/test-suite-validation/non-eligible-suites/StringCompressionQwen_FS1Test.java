package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionQwen_FS1Test {

  @Test
  void testCompress_emptyString() {
      assertEquals("", StringCompression.compress(""));
  }

  @Test
  void testCompress_singleCharacter() {
      assertEquals("a", StringCompression.compress("a"));
  }

  @Test
  void testCompress_twoSameCharacters() {
      assertEquals("a2", StringCompression.compress("aa"));
  }

  @Test
  void testCompress_multipleSameCharacters() {
      assertEquals("a4", StringCompression.compress("aaaa"));
  }

  @Test
  void testCompress_mixedCharactersNoRepetition() {
      assertEquals("abc", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_mixedWithRepetition() {
      assertEquals("a2bc3d", StringCompression.compress("aabcccdd"));
  }

  @Test
  void testCompress_complexRepetition() {
      assertEquals("a3b2c4d", StringCompression.compress("aaabbcddd"));
  }

  @Test
  void testCompress_singleCharacterAtEnd() {
      assertEquals("a2b", StringCompression.compress("aab"));
  }

  @Test
  void testCompress_longRepetition() {
      assertEquals("x10", StringCompression.compress("xxxxxxxxxx"));
  }

  @Test
  void testCompress_alternatingCharacters() {
      assertEquals("abab", StringCompression.compress("abab"));
  }
}
