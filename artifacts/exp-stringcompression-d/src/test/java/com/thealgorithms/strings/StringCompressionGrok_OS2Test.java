package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_OS2Test {

  @Test
  void testCompress_SingleChar() {
      assertEquals("a", StringCompression.compress("a"));
  }

  @Test
  void testCompress_TwoSameChars() {
      assertEquals("a2", StringCompression.compress("aa"));
  }

  @Test
  void testCompress_TwoDifferentChars() {
      assertEquals("ab", StringCompression.compress("ab"));
  }

  @Test
  void testCompress_ThreeSameChars() {
      assertEquals("a3", StringCompression.compress("aaa"));
  }

  @Test
  void testCompress_NoRepeats() {
      assertEquals("abc", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_MixedRepeats() {
      assertEquals("a2b3", StringCompression.compress("aabbb"));
  }

  @Test
  void testCompress_RepeatsAtEnd() {
      assertEquals("a3b", StringCompression.compress("aaab"));
  }

  @Test
  void testCompress_RepeatsInMiddle() {
      assertEquals("a2b2c", StringCompression.compress("aabbc"));
  }

  @Test
  void testCompress_AllSame() {
      assertEquals("a4", StringCompression.compress("aaaa"));
  }

  @Test
  void testCompress_Alternating() {
      assertEquals("aba", StringCompression.compress("aba"));
  }
}
