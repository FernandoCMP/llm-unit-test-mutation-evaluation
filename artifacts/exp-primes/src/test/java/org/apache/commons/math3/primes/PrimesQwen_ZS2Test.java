package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_ZS2Test {

    @Test
    public void testNextPrime_negativeInput() {
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
    public void testNextPrime_largeNonPrime() {
        assertEquals(101, Primes.nextPrime(100));
    }

    @Test
    public void testNextPrime_largePrime() {
        assertEquals(97, Primes.nextPrime(97));
    }

    @Test
    public void testNextPrime_edgeCaseBeforeLargeGap() {
        assertEquals(2147483647, Primes.nextPrime(2147483646));
    }

    @Test
    public void testNextPrime_maximumInteger() {
        assertEquals(2147483647, Primes.nextPrime(Integer.MAX_VALUE));
    }
}
// ```