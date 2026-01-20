package org.apache.commons.math3.primes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class PrimesGrok_ZS2Test {

  @Test
  public void testNextPrime_negative() {
      assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
  }

  @Test
  public void testNextPrime_zero() {
      assertEquals(2, Primes.nextPrime(0));
  }

  @Test
  public void testNextPrime_one() {
      assertEquals(2, Primes.nextPrime(1));
  }

  @Test
  public void testNextPrime_two() {
      assertEquals(2, Primes.nextPrime(2));
  }

  @Test
  public void testNextPrime_three() {
      assertEquals(3, Primes.nextPrime(3));
  }

  @Test
  public void testNextPrime_four() {
      assertEquals(5, Primes.nextPrime(4));
  }

  @Test
  public void testNextPrime_five() {
      assertEquals(5, Primes.nextPrime(5));
  }

  @Test
  public void testNextPrime_six() {
      assertEquals(7, Primes.nextPrime(6));
  }

  @Test
  public void testNextPrime_seven() {
      assertEquals(7, Primes.nextPrime(7));
  }

  @Test
  public void testNextPrime_eight() {
      assertEquals(11, Primes.nextPrime(8));
  }

  @Test
  public void testNextPrime_nine() {
      assertEquals(11, Primes.nextPrime(9));
  }

  @Test
  public void testNextPrime_ten() {
      assertEquals(11, Primes.nextPrime(10));
  }

  @Test
  public void testNextPrime_eleven() {
      assertEquals(11, Primes.nextPrime(11));
  }

  @Test
  public void testNextPrime_twelve() {
      assertEquals(13, Primes.nextPrime(12));
  }

  @Test
  public void testNextPrime_thirteen() {
      assertEquals(13, Primes.nextPrime(13));
  }

  @Test
  public void testNextPrime_fourteen() {
      assertEquals(17, Primes.nextPrime(14));
  }

  @Test
  public void testNextPrime_fifteen() {
      assertEquals(17, Primes.nextPrime(15));
  }

  @Test
  public void testNextPrime_sixteen() {
      assertEquals(17, Primes.nextPrime(16));
  }

  @Test
  public void testNextPrime_seventeen() {
      assertEquals(17, Primes.nextPrime(17));
  }

  @Test
  public void testNextPrime_eighteen() {
      assertEquals(19, Primes.nextPrime(18));
  }

  @Test
  public void testNextPrime_nineteen() {
      assertEquals(19, Primes.nextPrime(19));
  }

  @Test
  public void testNextPrime_twenty() {
      assertEquals(23, Primes.nextPrime(20));
  }

  @Test
  public void testNextPrime_twenty_one() {
      assertEquals(23, Primes.nextPrime(21));
  }

  @Test
  public void testNextPrime_twenty_two() {
      assertEquals(23, Primes.nextPrime(22));
  }

  @Test
  public void testNextPrime_twenty_three() {
      assertEquals(23, Primes.nextPrime(23));
  }

  @Test
  public void testNextPrime_twenty_four() {
      assertEquals(29, Primes.nextPrime(24));
  }

  @Test
  public void testNextPrime_twenty_five() {
      assertEquals(29, Primes.nextPrime(25));
  }

  @Test
  public void testNextPrime_twenty_six() {
      assertEquals(29, Primes.nextPrime(26));
  }

  @Test
  public void testNextPrime_twenty_seven() {
      assertEquals(29, Primes.nextPrime(27));
  }

  @Test
  public void testNextPrime_twenty_eight() {
      assertEquals(29, Primes.nextPrime(28));
  }

  @Test
  public void testNextPrime_twenty_nine() {
      assertEquals(29, Primes.nextPrime(29));
  }

  @Test
  public void testNextPrime_thirty() {
      assertEquals(31, Primes.nextPrime(30));
  }

}
