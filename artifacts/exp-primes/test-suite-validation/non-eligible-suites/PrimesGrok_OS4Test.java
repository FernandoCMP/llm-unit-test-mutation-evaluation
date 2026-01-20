package org.apache.commons.math3.primes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;

public class PrimesGrok_OS4Test {

  @Test
  void testNextPrime_NegativeInput() {
      assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
  }

  @Test
  void testNextPrime_Zero() {
      assertEquals(2, Primes.nextPrime(0));
  }

  @Test
  void testNextPrime_One() {
      assertEquals(2, Primes.nextPrime(1));
  }

  @Test
  void testNextPrime_Two() {
      assertEquals(2, Primes.nextPrime(2));
  }

  @Test
  void testNextPrime_Three() {
      assertEquals(3, Primes.nextPrime(3));
  }

  @Test
  void testNextPrime_Four() {
      assertEquals(5, Primes.nextPrime(4));
  }

  @Test
  void testNextPrime_Ten() {
      assertEquals(11, Primes.nextPrime(10));
  }

  @Test
  void testNextPrime_Hundred() {
      assertEquals(101, Primes.nextPrime(100));
  }

  @Test
  void testNextPrime_LargeNumber() {
      assertEquals(10007, Primes.nextPrime(10000));
  }
}
