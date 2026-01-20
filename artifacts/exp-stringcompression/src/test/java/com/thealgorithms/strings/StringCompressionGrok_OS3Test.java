package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.thealgorithms.strings.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionGrok_OS3Test {

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
  void testCompress_NoRepeats() {
      assertEquals("abc", StringCompression.compress("abc"));
  }

  @Test
  void testCompress_AllRepeats() {
      assertEquals("a4", StringCompression.compress("aaaa"));
  }

  @Test
  void testCompress_MixedRepeats() {
      assertEquals("a3b2c", StringCompression.compress("aaabbc"));
  }

  @Test
  void testCompress_RepeatsAtEnd() {
      assertEquals("ab3", StringCompression.compress("abbb"));
  }

  @Test
  void testCompress_RepeatsAtStart() {
      assertEquals("a3bc", StringCompression.compress("aaabc"));
  }

  @Test
  void testCompress_SingleRepeatInMiddle() {
      assertEquals("a2ba2", StringCompression.compress("aabaa"));
  }

  @Test
  void testCompress_LongString() {
      assertEquals("a3b3c3", StringCompression.compress("aaabbbccc"));
  }
}
